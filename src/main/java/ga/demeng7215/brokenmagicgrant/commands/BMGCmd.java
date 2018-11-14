package ga.demeng7215.brokenmagicgrant.commands;

import ga.demeng7215.brokenmagicgrant.BrokenMagicGrant;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BMGCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Bukkit.getConsoleSender().sendMessage(BrokenMagicGrant.format("&9Running BrokenMagicGrant v1.0.0 by Demeng7215"));

        return false;
    }
}