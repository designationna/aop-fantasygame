package Game;

import java.util.Arrays;
import java.util.List;

public class Weapon extends Item {
	private static List<String> combatAdjectives = Arrays.asList("zermalmt", "verprügelt", "erschlagen", "gehauen");
	
	Weapon(List<String> names) {
		super(names);
	}
	
	public static String genAdjective() {
		int randomInt = (int) Math.floor( Math.random() * ( combatAdjectives.size() - 2 ) + 1);
		return combatAdjectives.get(randomInt);
	}
	
	protected int genPrice() {
		int maxPrice = 300;
		int minPrice = 100;
		int price = (int) Math.floor( Math.random() * ( maxPrice - minPrice ) + minPrice);
		return price;
	}
}
