package ga.demeng7215.brokenmagicgrant.commands;

import ga.demeng7215.brokenmagicgrant.BrokenMagicGrant;
import ga.demeng7215.brokenmagicgrant.inventories.RankSelectInv;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GrantCmd implements CommandExecutor {

    private BrokenMagicGrant instance;

    public GrantCmd(BrokenMagicGrant instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(BrokenMagicGrant.format(instance.getConfig().getString("console")));
            return false;
        }

        Player p = (Player) sender;

        if (!p.hasPermission("grant.gui")) {
            p.sendMessage(BrokenMagicGrant.format(instance.getConfig().getString("no-permission")));
            return false;
        }

        if (args.length < 1) {
            p.sendMessage(BrokenMagicGrant.format(instance.getConfig().getString("invalid-usage")));
            return false;
        }

        RankSelectInv rankSelectInv = new RankSelectInv(Bukkit.getOfflinePlayer(args[0]), p);
        rankSelectInv.open(p);

        return true;
    }
}