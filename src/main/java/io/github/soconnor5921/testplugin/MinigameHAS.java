package io.github.soconnor5921.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MinigameHAS
{
    private Player hider;
    private Player seeker;

    public MinigameHAS(Player hider, Player seeker)
    {
        this.hider = hider;
        this.seeker = seeker;
    }

    public void start()
    {
        Bukkit.broadcastMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Hide and seek has started! " + ChatColor.BLUE + hider.getName() + ChatColor.GREEN + " is the Hider and " + ChatColor.RED + seeker.getName() + ChatColor.GREEN + " is the Seeker!");
    }
}
