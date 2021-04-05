package ru.hyper.test;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listeners implements Listener {

 @EventHandler
 public void onPlayerJoin(PlayerJoinEvent event){
   Player player = event.getPlayer();
   event.setJoinMessage(player.getDisplayName + ChatColor.RED + " join to consolka");
 }

 public void onPlayerQuit(PlayerQuitEvent event) {
    Player player = event.getPlayer();
    event.setQuitMessage(player.getDisplayName() + ChatColor.YELOW + " leave consolka");
  }
}
