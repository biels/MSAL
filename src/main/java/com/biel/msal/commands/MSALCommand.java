package com.biel.msal.commands;

import org.bukkit.command.CommandExecutor;

/**
 * Created by Biel on 24/1/2017.
 */
public abstract class MSALCommand implements CommandExecutor {
    public abstract String getName();
    public abstract String getDescription();
    public enum CommandType{INFORMATIVE, ADMINISTRATIVE}
    public abstract CommandType getCommandType();
}
