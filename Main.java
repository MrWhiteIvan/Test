package ru.hyper.test;

import org.bukkit.plugin.java.JavaPlugin;
import ru.hyper.test.listeners.Listeners;

public class Main extends JavaPlugin {
    @Override
    public void onLoad(){
     getServer().getConsoleSender().sendMessage("Плагин загружается..");
  }
    @Override
    public void onEnable() {
     getServer().getPluginManager().registerEvents(new Listeners(), this);
     getServer().getConsoleSender().sendMessage("Плагин успешно включен!");
  }
    @Override
    public void onDisable(){
     getServer().getConsoleSender().sendMessage("Плагин успешно выключен!");
  }
}
