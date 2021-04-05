import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler

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
