package mangobox.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class MiniBattles extends JavaPlugin implements Listener{

	BattleMenu battleMenu;
	
	public MiniBattles() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onEnable() {
		getLogger().info("MangoBoxs MiniBattles Plugin has been loaded!");
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("battle") && sender instanceof Player) {
			sender.sendMessage("Hey there!");
			new BattleMenu().OpenBattleMenu((Player) sender);
			return false;
		}
			return false;
	}

}
