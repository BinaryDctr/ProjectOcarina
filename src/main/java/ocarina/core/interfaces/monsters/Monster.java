package ocarina.core.interfaces.monsters;

import ocarina.core.enums.MonsterType;
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
public interface Monster {

    Entity getEntity();

    MonsterType getMonsterType();

    Double getDamage();

}
