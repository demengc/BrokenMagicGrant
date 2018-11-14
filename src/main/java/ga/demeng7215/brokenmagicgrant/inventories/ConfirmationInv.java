package ga.demeng7215.brokenmagicgrant.inventories;

import ga.demeng7215.brokenmagicgrant.BrokenMagicGrant;
import ga.demeng7215.brokenmagicgrant.utils.CustomInventory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ConfirmationInv extends CustomInventory {

    public ConfirmationInv(OfflinePlayer p, String rank, String reason, Player op) {
        super(18, "&9&lConfirm Grant");

        setItem(4, new ItemStack(Material.OBSIDIAN), player -> {
        }, "&9&lInformation", new String[]{
                "&fPlayer: &d" + p.getName(),
                "&fRank: &d" + rank,
                "&fReason: &d" + reason});

        setItem(12, new ItemStack(Material.EMERALD_BLOCK), player -> {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() +
                    " group add " + rank.toLowerCase());
            player.closeInventory();
            player.sendMessage(BrokenMagicGrant.format("&fGave &d" + p.getName() + " &fthe &d" + rank +
                    " &frank for the reason &d" + reason + "&f."));
        }, "&2&lCONFIRM", new String[]{});


        setItem(13, new ItemStack(Material.REDSTONE_BLOCK), player -> {
            player.sendMessage(BrokenMagicGrant.format("&fGrant declined."));
            player.closeInventory();
        }, "&4&lDECLINE", new String[]{});


        setItem(14, new ItemStack(Material.ARROW), player -> {
            new GrantReasonInv(player, rank, op).open(player);
        }, "&7&lBack", new String[]{});
    }
}