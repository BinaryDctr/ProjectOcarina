package ocarina.game.landmarks.kokiriforest;

import ocarina.core.interfaces.Landmark;
import ocarina.core.interfaces.characters.Character;
import ocarina.core.interfaces.chests.SmallChest;
import ocarina.core.interfaces.shops.Shop;

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
public class KokiriForest implements Landmark {

    public String getName() {
        return "Kokiri Forest";
    }

    public List<SmallChest> getSmallChests() {
        return null;
    }

    public List<ocarina.core.interfaces.characters.Character> getCharacters() {
        List<Character> characters = new ArrayList<Character>();
        return characters;
    }

    public List<Shop> getShops() {
        List<Shop> shops = new ArrayList<Shop>();
        return shops;
    }
}
