import org.bukkit;
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
     getServer().getPluginManager().registerEvents(new Listeners(), this);
  }
}
