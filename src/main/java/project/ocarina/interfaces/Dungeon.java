package project.ocarina.interfaces;

import org.bukkit.Location;
import project.ocarina.interfaces.chests.HeartChest;
import project.ocarina.interfaces.chests.MinibossChest;
import project.ocarina.interfaces.chests.SmallChest;

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
public interface Dungeon {

    Location getStart();

    Location getEnd();

    List<SmallChest> getSmallChests();

    List<MinibossChest> getMinibossChests();

    List<HeartChest> getHeartChests();

}
