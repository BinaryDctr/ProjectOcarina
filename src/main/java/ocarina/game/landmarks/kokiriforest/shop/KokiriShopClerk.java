package ocarina.game.landmarks.kokiriforest.shop;

import ocarina.core.interfaces.shops.Shop;
import ocarina.core.interfaces.shops.ShopClerk;
import org.bukkit.entity.Entity;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public class KokiriShopClerk implements ShopClerk {

    public Shop getShop() {
        return new KokiriShop();
    }

    public Entity getEntity() {
        return null;
    }

    public net.minecraft.server.v1_8_R3.Entity getNMSEntity() {
        return null;
    }

    public void spawn() {

    }
}
