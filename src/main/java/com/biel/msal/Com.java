package com.biel.msal;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * Created by Biel on 25/1/2017.
 */
public class Com {
    public static MSALPlugin getPlugin() {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("msal");
        return (MSALPlugin) plugin;
    }
}
