package me.peter.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

	public void onEnable() {
		Bukkit.getServer().getLogger().info("MasterBan Plugin Enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("MasterBan Plugin Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.AQUA + "The console ran the test command! Good job!");
			return true;
		}
		
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("bored")) {
			player.sendMessage(ChatColor.GOLD + "Mitochondria is the powerhouse of a cell");
		}
		return true;
	}
}
