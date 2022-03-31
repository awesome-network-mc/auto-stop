package xyz.awesomenetwork.autostop;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoStop extends JavaPlugin {

	public void onEnable() {
		getServer().getScheduler().scheduleSyncDelayedTask(this, () -> getServer().shutdown(), 1);
	}
	
}
