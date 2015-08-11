package ocarina.core.extendables;

import org.bukkit.event.Listener;
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
public class Manager implements Listener {

    String name;

    JavaPlugin plugin;

    public Manager(String name, JavaPlugin plugin) {
        this.name = name;
        this.plugin = plugin;
        registerEvent(this);
    }

    public void registerEvent(Listener listener) {
        this.plugin.getServer().getPluginManager().registerEvents(listener, this.plugin);
    }

    public String getName() {
        return name;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}
