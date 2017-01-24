package com.biel.msal.commands;

import com.biel.msal.commands.specific.VersionCmd;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Biel on 24/1/2017.
 */
public class MSALCommandExecutor implements CommandExecutor {
    Map<String, MSALCommand> map = new HashMap<>();
    private void registerCommands(){
        map.put("version", new VersionCmd());
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String msalCmd = args[0];
        MSALCommand msalCommand = map.get(msalCmd);
        if(msalCommand != null){
            return msalCommand.onCommand(sender, command, msalCmd, Arrays.copyOfRange(args, 1, args.length));
        }
        sender.sendMessage("Command " + msalCmd + " is not a MSAL command");
        return false;
    }

}
