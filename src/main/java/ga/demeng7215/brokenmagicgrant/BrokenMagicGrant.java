package ga.demeng7215.brokenmagicgrant;

import ga.demeng7215.brokenmagicgrant.commands.BMGCmd;
import ga.demeng7215.brokenmagicgrant.commands.GrantCmd;
import ga.demeng7215.brokenmagicgrant.inventories.RankSelectInv;
import ga.demeng7215.brokenmagicgrant.listeners.InvClickListener;
import ga.demeng7215.brokenmagicgrant.listeners.InvCloseListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class BrokenMagicGrant extends JavaPlugin {

    private static String prefix;

    @Override
    public void onEnable() {

        saveDefaultConfig();
        prefix = getConfig().getString("prefix");

        getCommand("brokenmagicgrant").setExecutor(new BMGCmd());
        getCommand("grant").setExecutor(new GrantCmd(this));

        Bukkit.getPluginManager().registerEvents(new InvClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new InvCloseListener(), this);

        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "BrokenMagicGrant v1.0.0 by Demeng7215 has been " +
                "successfully enabled.");

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "BrokenMagicGrant v1.0.0 by Demeng7215 has been " +
                "successfully disabled.");
    }

    public static String format(String message) {
        return ChatColor.translateAlternateColorCodes('&', prefix + message);
    }
}