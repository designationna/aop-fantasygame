package Game;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Player player = new Player("Arthur der Große");
		
		Blacksmith blacksmith = new Blacksmith();
		Jeweller jeweller = new Jeweller();
		Bookstore bookstore = new Bookstore();
		
		List<Shop> stores = Arrays.asList(blacksmith, jeweller, bookstore);
		
		while (player.canAffordItemsFrom(stores)) {
			player.buyFrom(blacksmith);
			player.buyFrom(jeweller);
			player.buyFrom(bookstore);
		}
		
		for (Item item : player.getInventory()) {
			player.use(item);
		}
		
		System.out.println();
		
		player.printCombatStrength();
	}
}
