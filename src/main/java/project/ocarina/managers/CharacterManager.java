package project.ocarina.managers;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import project.ocarina.interfaces.characters.*;
import project.ocarina.interfaces.characters.Character;

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
public class CharacterManager implements Listener {

    JavaPlugin plugin;
    Character[] characters;

    public CharacterManager(JavaPlugin plugin) {
        this.plugin = plugin;
        characters = new Character[]
        {



        };
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent event) {
        if(!(event.getRightClicked() instanceof Player)) {
            return;
        }

        Entity entity = event.getRightClicked();
        Player player = event.getPlayer();

        for (Character character : characters) {
            if(entity.equals(character.getEntity())) {

            }
        }
    }

}
