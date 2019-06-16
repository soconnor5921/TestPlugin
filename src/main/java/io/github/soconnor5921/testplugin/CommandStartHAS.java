package io.github.soconnor5921.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CommandStartHAS implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player hider = Bukkit.getPlayer(args[0]);
        Player seeker = Bukkit.getPlayer(args[1]);

        //Gets Inventories
        PlayerInventory hiderInv = hider.getInventory();
        PlayerInventory seekerInv = seeker.getInventory();

        //Disables flight for Hider and enables it for Seeker
        hider.setAllowFlight(false);
        seeker.setAllowFlight(true);

        //Clears Inventories
        hiderInv.clear();
        seekerInv.clear();

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

        //Gives all the necessary items to the Seeker
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

        //Initialize Start of Minigame
        MinigameHAS game = new MinigameHAS(hider, seeker);
        game.start();

        return true;
    }
}
