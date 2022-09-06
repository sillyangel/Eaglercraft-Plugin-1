package ml.sillyangel.commands;

import java.util.logging.Level;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().log(Level.INFO, "Hello, World!");
  }
  @Override
  public void onDisable() {
    
  }
  @Override
  public boolean onCommand(CommandSender sender, Command cmd,
                          String label, String[] args) {
    if(label.equalsIgnoreCase("mycommand")) {
      sender.sendMessage("Hello, World!");
    }
    return false;
  }
  
}