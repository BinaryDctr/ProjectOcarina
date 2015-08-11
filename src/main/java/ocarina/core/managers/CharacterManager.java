package ocarina.core.managers;

import ocarina.core.extendables.Manager;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ******************************************************************
 * Copyright ProjectOcarina (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of ProjectOcarina. Distribution, reproduction, taking snippets, or
 * claiming any contents as your will break the terms of the license, and void any
 * agreements with you, the third party.
 * ******************************************************************
 **/
public class CharacterManager extends Manager {

    public CharacterManager(JavaPlugin plugin) {
        super("Character", plugin);
    }

    @EventHandler
    public void onCharacter() {

    }

}
