package ocarina;

import ocarina.core.interfaces.Dungeon;
import ocarina.core.interfaces.Landmark;
import ocarina.game.landmarks.kokiriforest.KokiriForest;
import ocarina.game.managers.PlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

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
public class ProjectOcarina extends JavaPlugin {

    /*
    asdaqdadahai jda dasda adada 
     */

    static ProjectOcarina instance;
    List<Landmark> landmarks;
    List<Dungeon> dungeons;

    @Override
    public void onEnable() {

        instance = this;

        getServer().getPluginManager().registerEvents(new PlayerManager(), this);

        /*
        Landmarks
         */

        landmarks = new ArrayList<Landmark>();
        landmarks.add(new KokiriForest());

        /*
        Dungeons
         */

        dungeons = new ArrayList<Dungeon>();
    }

    @Override
    public void onDisable() {

    }

    public static ProjectOcarina getInstance() {
        return instance;
    }

    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    public List<Dungeon> getDungeons() {
        return dungeons;
    }
}
