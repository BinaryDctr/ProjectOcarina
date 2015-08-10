package project.ocarina.interfaces;

import project.ocarina.interfaces.chests.SmallChest;
import project.ocarina.interfaces.shops.Shop;

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
public interface Landmark {

    String getName();

    List<SmallChest> getSmallChests();

    List<project.ocarina.interfaces.characters.Character> getCharacters();

    List<Shop> getShops();

}
