package ocarina.game.landmarks.kokiriforest.shop;

import ocarina.core.interfaces.items.Item;
import ocarina.core.interfaces.shops.Shop;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
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
public class KokiriShop implements Shop {

    public EntityType getEntityType() {
        return EntityType.VILLAGER;
    }

    public String getName() {
        return "KokiriShop";
    }

    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        return items;
    }

    public Location getLocation() {
        return new Location(Bukkit.getWorld("world"), 1114.5, 57, 1395.5, 90, 0);
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, 17, getName());

        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("OPEN SLOT");
        itemStack.setItemMeta(itemMeta);

        inv.setItem(0, itemStack);
        inv.setItem(1, itemStack);
        inv.setItem(2, itemStack);
        inv.setItem(7, itemStack);
        inv.setItem(8, itemStack);

        inv.setItem(9, itemStack);
        inv.setItem(10, itemStack);
        inv.setItem(15, itemStack);
        inv.setItem(16, itemStack);
        inv.setItem(17, itemStack);

        for(int i = 0; i < getItems().size(); i++) {
            ItemStack items = getItems().get(i).getItem();
            inv.addItem(items);
        }
        return inv;
    }
}
