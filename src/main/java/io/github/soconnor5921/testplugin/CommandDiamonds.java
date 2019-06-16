package io.github.soconnor5921.testplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandDiamonds implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;
            //int amt = Integer.parseInt(args[0]);

            ItemStack diamonds = new ItemStack(Material.DIAMOND, 64);
            player.getInventory().addItem(diamonds);
        }
        return true;
    }
}
