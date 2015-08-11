package ocarina.core.utilities;

import net.minecraft.server.v1_8_R3.*;
import net.minecraft.server.v1_8_R3.Entity;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public class Packets {

    public static void makeName(EntityLiving entityLiving, String name, Location location, Player player) {
        WorldServer worldServer = entityLiving.getWorld().getWorld().getHandle();
        EntityArmorStand stand = new EntityArmorStand(worldServer);

        stand.setLocation(location.getX(), location.getY()+1, location.getZ(), location.getYaw(), location.getPitch());
        stand.setInvisible(true);
        stand.setSmall(true);
        stand.setCustomName(name);
        stand.setCustomNameVisible(true);
        LivingEntity ent = (LivingEntity) stand.getBukkitEntity();
        ent.setRemoveWhenFarAway(false);
        entityLiving.getBukkitEntity().setPassenger(stand.getBukkitEntity());

        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
        System.out.println(entityLiving.getBukkitEntity().getPassenger().toString());
    }


    public static void rideName(org.bukkit.entity.Entity entity, String name, Location location, Player player) {
        WorldServer worldServer = ((CraftWorld) entity.getWorld()).getHandle();
        EntityArmorStand stand = new EntityArmorStand(worldServer);

        stand.setLocation(location.getX(), location.getY() + 2, location.getZ(), location.getYaw(), location.getPitch());
        stand.setInvisible(true);
        stand.setSmall(true);
        stand.setCustomName(name);
        stand.setCustomNameVisible(true);
        LivingEntity ent = (LivingEntity) stand.getBukkitEntity();
        ent.setRemoveWhenFarAway(false);
        entity.setPassenger(ent);

        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
    }

    public static void sendTitle(Player p, String title, int fadein, int stay, int fadeout) {
        String title1 = ChatColor.translateAlternateColorCodes('&', title);
        IChatBaseComponent message = IChatBaseComponent.ChatSerializer.a("{\"text\": \"\"}").a(title1);
        PacketPlayOutTitle packet = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, message, fadein, stay, fadeout);

        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    }

    public static void sendSubTitle(Player p, String subtitle, int fadein, int stay, int fadeout) {
        IChatBaseComponent message = IChatBaseComponent.ChatSerializer.a("{\"text\": \"\"}").a(subtitle);
        PacketPlayOutTitle packet = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, message, fadein, stay, fadeout);

        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    }

    public static void reset(Player p) {
        PacketPlayOutTitle packet = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.RESET, null);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    }

    public static void clear(Player p) {
        PacketPlayOutTitle packet = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.CLEAR, null);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    }

    public static void sendActionBar(Player p, String message) {
        if (message == null) {
            message = "";
        }
        message = ChatColor.translateAlternateColorCodes('&', message);
        message = message.replaceAll("%PLAYER%", p.getDisplayName());

        PlayerConnection con = ((CraftPlayer)p).getHandle().playerConnection;

        IChatBaseComponent chat = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message + "\"}");
        PacketPlayOutChat packet = new PacketPlayOutChat(chat, (byte)2);

        con.sendPacket(packet);
    }

    public static void sendTablist(Player p, String header, String footer) {
        if (header == null) {
            header = "";
        }
        if (footer == null) {
            footer = "";
        }
        header = ChatColor.translateAlternateColorCodes('&', header);
        footer = ChatColor.translateAlternateColorCodes('&', footer);

        header = header.replaceAll("%PLAYER%", p.getDisplayName());
        footer = footer.replaceAll("%PLAYER%", p.getDisplayName());

        PlayerConnection con = ((CraftPlayer)p).getHandle().playerConnection;

        IChatBaseComponent tabheader = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + header + "\"}");
        IChatBaseComponent tabfooter = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + footer + "\"}");

        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter(tabheader);
        try {
            Field f = packet.getClass().getDeclaredField("b");
            f.setAccessible(true);
            f.set(packet, tabfooter);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.sendPacket(packet);
        }
    }

    public static void noAI(org.bukkit.entity.Entity ent) {
        net.minecraft.server.v1_8_R3.Entity nmsEntity = ((CraftEntity) ent).getHandle();
        NBTTagCompound tag = nmsEntity.getNBTTag();
        if (tag == null) {
            tag = new NBTTagCompound();
        }
        nmsEntity.c(tag);
        tag.setInt("NoAI", 1);
        nmsEntity.f(tag);
    }

    public static void silent(org.bukkit.entity.Entity ent) {
        net.minecraft.server.v1_8_R3.Entity nmsEntity = ((CraftEntity) ent).getHandle();
        NBTTagCompound tag = nmsEntity.getNBTTag();
        if (tag == null) {
            tag = new NBTTagCompound();
        }
        nmsEntity.c(tag);
        tag.setInt("Silent", 1);
        nmsEntity.f(tag);
    }
}
