package ga.demeng7215.brokenmagicgrant.inventories;

import ga.demeng7215.brokenmagicgrant.utils.CustomInventory;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GrantReasonInv extends CustomInventory {

    public GrantReasonInv(OfflinePlayer p, String rank, Player op) {
        super(9, "&9&lSelect a Reason");

        setItem(0, new ItemStack(Material.PAPER), player -> {
            new ConfirmationInv(p, rank, "BuyCraft Issues", op).open(player);
        }, "&f&lBuyCraft Issues", new String[]{});


        setItem(1, new ItemStack(Material.PAPER), player -> {
            new ConfirmationInv(p, rank, "Promotion", op).open(player);
        }, "&f&lPromotion", new String[]{});


        setItem(2, new ItemStack(Material.PAPER), player -> {
            new ConfirmationInv(p, rank, "Demotion", op).open(player);
        }, "&f&lDemotion", new String[]{});


        setItem(3, new ItemStack(Material.EMPTY_MAP), player -> {
            new ConfirmationInv(p, rank, "No Reason", op).open(player);
        }, "&f&lNo Reason", new String[]{});

        setItem(8, new ItemStack(Material.ARROW), player -> {
            new RankSelectInv(player, op).open(player);
        }, "&7&lBack", new String[]{});
    }
}