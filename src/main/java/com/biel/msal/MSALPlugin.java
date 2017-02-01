package com.biel.msal;

import com.biel.msal.ae.AEManager;
import com.biel.msal.commands.MSALCommandExecutor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by biel on 22/01/17.
 */
public class MSALPlugin extends JavaPlugin {
    AEManager aeManager;
    @Override
    public void onEnable() {
        super.onEnable();
        //Start MSAL
        aeManager = new AEManager();
        //TODO Register event listeners
        getCommand("msal").setExecutor(new MSALCommandExecutor());
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }
}
