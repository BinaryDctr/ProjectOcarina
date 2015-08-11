package ocarina.core.interfaces.shops;

import net.minecraft.server.v1_8_R3.Entity;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public interface ShopClerk {

    Shop getShop();

    org.bukkit.entity.Entity getEntity();

    Entity getNMSEntity();

    void spawn();

}
