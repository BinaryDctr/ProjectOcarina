package project.ocarina.interfaces.shops;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import project.ocarina.interfaces.items.Item;

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
public interface Shop {

    EntityType getEntityType();

    String getName();

    List<Item> getItems();

    Location getLocation();
    
}
