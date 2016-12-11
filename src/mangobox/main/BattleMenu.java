package mangobox.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class BattleMenu implements Listener {

	Inventory battleMenu;
	
	public BattleMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void OpenBattleMenu(Player player) {
		battleMenu = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Battle Menu");
		
		player.openInventory(battleMenu);
	}
	

}
