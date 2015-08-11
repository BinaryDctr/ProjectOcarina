package ocarina.core.interfaces;

import ocarina.core.interfaces.chests.SmallChest;
import ocarina.core.interfaces.shops.Shop;

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

    List<ocarina.core.interfaces.characters.Character> getCharacters();

    List<Shop> getShops();

}
