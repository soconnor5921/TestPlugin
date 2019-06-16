package io.github.soconnor5921.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CommandSetSeeker implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player seeker = Bukkit.getPlayer(args[0]);

        //Gets Inventory
        PlayerInventory seekerInv = seeker.getInventory();

        //Enables flight for Seeker
        seeker.setAllowFlight(true);

        //Clears Inventory
        seekerInv.clear();

        //Gives all the necessary items to the Hider
        //Diamond Sword
        ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
        //Bow and Arrows
        ItemStack bow2 = new ItemStack(Material.BOW);
        ItemStack arrows2 = new ItemStack(Material.ARROW, 320);
        //Steak
        ItemStack steak2 = new ItemStack(Material.COOKED_BEEF, 320);
        //Diamond Armor
        ItemStack diamondHelment = new ItemStack(Material.DIAMOND_HELMET);
        ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);

        seekerInv.addItem(diamondSword, bow2, arrows2, steak2);
        seekerInv.setHelmet(diamondHelment);
        seekerInv.setChestplate(diamondChestplate);
        seekerInv.setLeggings(diamondLeggings);
        seekerInv.setBoots(diamondBoots);

        return true;
    }
}
