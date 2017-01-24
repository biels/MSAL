package com.biel.msal.commands.specific;

import com.biel.msal.commands.MSALCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Biel on 24/1/2017.
 */
public class VersionCmd extends MSALCommand {

    @Override
    public String getName() {
        return "version";
    }

    @Override
    public String getDescription() {
        return "Displays the version of MSAL";
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.INFORMATIVE;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
