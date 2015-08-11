package ocarina.core.interfaces.characters;

import net.minecraft.server.v1_8_R3.Entity;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public interface Character {

    Entity getNMSEntity();

    org.bukkit.entity.Entity getEntity();

    Location getLocation();

    String getName();

    List<String> getMessages();

    int getMessageDelay();

    void spawn(Player player);

}
