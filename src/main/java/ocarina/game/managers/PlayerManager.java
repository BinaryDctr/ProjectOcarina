package ocarina.game.managers;

import ocarina.ProjectOcarina;
import ocarina.core.interfaces.Landmark;
import ocarina.core.interfaces.characters.*;
import ocarina.core.interfaces.characters.Character;
import ocarina.core.utilities.Packets;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerJoinEvent;

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
public class PlayerManager implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Packets.sendTablist(event.getPlayer(), ChatColor.GOLD +""+ ChatColor.BOLD + "Project Ocarina", ChatColor.WHITE + "Help support the project.");

        List<Landmark> landmarks = ProjectOcarina.getInstance().getLandmarks();
        for(int i = 0; i < landmarks.size(); i++) {
            Landmark landmark = landmarks.get(i);
            List<ocarina.core.interfaces.characters.Character> characters = landmark.getCharacters();
            for(int ii = 0; ii < characters.size(); ii++) {
                Character character = characters.get(ii);
                character.spawn(event.getPlayer());
            }
        }
    }
}
