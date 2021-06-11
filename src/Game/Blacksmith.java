package Game;

import java.util.ArrayList;
import java.util.List;

public class Blacksmith extends Shop {
	protected List<? extends Weapon> inventory;
	
	Blacksmith() {
		super("Schmiede");
	}
	
	protected List<? extends Weapon> generateInventory() {
		int min = 1;
		int max = 10;
		int randomInt1 = (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		int randomInt2= (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		
		List<Weapon> weapons = new ArrayList<>();
		
		for (int i = 0; i < randomInt1; i++) {
			weapons.add(new Sword());
		}
		
		for (int i = 0; i < randomInt2; i++) {
			weapons.add(new Bow());
		}

		return weapons;
	}
}
