package io.github.soconnor5921.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CommandSetHider implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player hider = Bukkit.getPlayer(args[0]);

        //Gets Inventory
        PlayerInventory hiderInv = hider.getInventory();


        //Disables flight for Hider
        hider.setAllowFlight(false);

        //Clears Inventory
        hiderInv.clear();

        //Gives all the necessary items to the Hider
        //Iron Sword
        ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
        //Bow and Arrows
        ItemStack bow = new ItemStack(Material.BOW);
        ItemStack arrows = new ItemStack(Material.ARROW, 64);
        //Steak
        ItemStack steak = new ItemStack(Material.COOKED_BEEF, 32);
        //Leather Armor
        ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);
        ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);

        hiderInv.addItem(ironSword, bow, arrows, steak);
        hiderInv.setHelmet(leatherHelmet);
        hiderInv.setChestplate(leatherChestplate);
        hiderInv.setLeggings(leatherLeggings);
        hiderInv.setBoots(leatherBoots);

        return true;
    }
}
