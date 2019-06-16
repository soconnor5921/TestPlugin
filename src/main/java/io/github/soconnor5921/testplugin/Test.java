package io.github.soconnor5921.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("onEnable is called!");

        //Register Commands
        this.getCommand("starthas").setExecutor(new CommandStartHAS());
        this.getCommand("sethider").setExecutor(new CommandSetHider());
        this.getCommand("setseeker").setExecutor(new CommandSetSeeker());
        this.getCommand("diamonds").setExecutor(new CommandDiamonds());

        this.getCommand("kit").setExecutor(new CommandKit());

    }
    @Override
    public void onDisable()
    {
        getLogger().info("onDisable is called!");
    }
}
