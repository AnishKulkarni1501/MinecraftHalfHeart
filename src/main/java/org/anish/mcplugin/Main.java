package org.anish.mcplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerRespawnEvent;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Half Heart Enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // Set max health to 1
        player.setMaxHealth(1.0);

        // Set current health to max
        player.setHealth(1.0);

        player.sendMessage("Your health is now limited to 1/2 heart!");
    }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();
        player.setMaxHealth(1.0);
        player.setHealth(1.0);
    }
}
