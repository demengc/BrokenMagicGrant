package ga.demeng7215.brokenmagicgrant.inventories;

import ga.demeng7215.brokenmagicgrant.utils.CustomInventory;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RankSelectInv extends CustomInventory {

    public RankSelectInv(OfflinePlayer p, Player op) {
        super(18, "&9&lChoose a Rank");

        setItem(0, new ItemStack(Material.WOOL, 1, (byte) 5), player -> {
            new GrantReasonInv(p, "Member", op).open(player);
        }, "&a&lMember", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dMember &frank.",
                "&9-----------------------------------------"});


        setItem(1, new ItemStack(Material.EMERALD_BLOCK), player -> {
            new GrantReasonInv(p, "Donator", op).open(player);
        }, "&2&lDonator", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dDonator &frank.",
                "&9-----------------------------------------"});


        setItem(2, new ItemStack(Material.WOOL, 1, (byte) 2), player -> {
            new GrantReasonInv(p, "Moderator", op).open(player);
        }, "&d&lModerator", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dModerator &frank.",
                "&9-----------------------------------------"});


        setItem(3, new ItemStack(Material.WOOL, 1, (byte) 12), player -> {
            new GrantReasonInv(p, "Builder", op).open(player);
        }, "&7&lBuilder", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dBuilder &frank.",
                "&9-----------------------------------------"});


        setItem(4, new ItemStack(Material.WOOL, 1, (byte) 4), player -> {
            new GrantReasonInv(p, "Admin", op).open(player);
        }, "&6&lAdmin", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dAdmin &frank.",
                "&9-----------------------------------------"});


        setItem(5, new ItemStack(Material.WOOL, 1, (byte) 9), player -> {
            new GrantReasonInv(p, "Developer", op).open(player);
        }, "&3&lDeveloper", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dDeveloper &frank.",
                "&9-----------------------------------------"});


        setItem(6, new ItemStack(Material.WOOL, 1, (byte) 7), player -> {
            new GrantReasonInv(p, "Head-Admin", op).open(player);
        }, "&8&lHead-Admin", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dHead-Admin &frank.",
                "&9-----------------------------------------"});


        setItem(7, new ItemStack(Material.WOOL, 1, (byte) 0), player -> {
            new GrantReasonInv(p, "YouTube", op).open(player);
        }, "&c&lYou&f&lTube", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dYouTube &frank.",
                "&9-----------------------------------------"});


        setItem(8, new ItemStack(Material.WOOL, 1, (byte) 3), player -> {
            new GrantReasonInv(p, "CoOwner", op).open(player);
        }, "&9&lCo-Owner", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dCo-Owner &frank.",
                "&9-----------------------------------------"});

        setItem(13, new ItemStack(Material.WOOL, 1, (byte) 14), player -> {
            new GrantReasonInv(p, "Owner", op).open(player);
        }, "&c&lOwner", new String[]{
                "&9-----------------------------------------",
                "&fClick to grant &d" + p.getName() + " &fthe &dOWNER &frank.",
                "&9-----------------------------------------"});
    }
}