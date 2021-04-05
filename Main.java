package ru.hyper.test;

import org.bukkit.plugin.java.JavaPlugin;
import ru.hyper.test.listeners.Listeners;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
     getServer().getPluginManager().registerEvents(new Listeners(), this);
  }
    @Override
    public void onDisable(){
  }
}
