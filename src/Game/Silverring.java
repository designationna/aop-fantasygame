package Game;

import java.util.Arrays;
import java.util.List;

public class Silverring extends Ring {
	protected static List<String> names = Arrays.asList("Silberring");
	protected int combatStrength;
	
	Silverring() {
		super(names);
		this.combatStrength = genCombatStrength(this.price);
		this.onUse = "Die Kampfstärke wurde erhöht.";
	}

	@Override
	protected int genPrice() {
		int maxPrice = 250;
		int minPrice = 50;
		int price = (int) Math.floor( Math.random() * ( maxPrice - minPrice ) + minPrice);
		return price;
	}
	
	protected static int genCombatStrength(int refPrice) {
		// combat strength will be generated depending on weapon price
		// Minimal combatStrength is 50% of 1/100 of the price
		// (e.g. : price = 500 --> Minimal combatStrength = 500 /100 * 0.5 = 2.5 --> 2)
		int minStrength = (int) ((int) Math.floor(refPrice / 100) * 0.5);
		int maxStrength = (int) Math.floor(refPrice / 100);
		int strength = (int) Math.floor( Math.random() * ( maxStrength - minStrength ) + minStrength + 1);
		return strength;
	}
	
	@Override
	protected void print() {
		System.out.println(this.name + " (Preis: " + this.price + ", Kampfstärke: " + this.combatStrength + ")");
	}
	
	public int getCombatStrength() {
		return this.combatStrength;
	}
}
