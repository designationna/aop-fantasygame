package Game;

import java.util.Arrays;
import java.util.List;

public class Sword extends Weapon {
	protected static List<String> names = Arrays.asList("Langschwert", "Zweihänder", "Dolch");
	
	Sword() {
		super(names);
		this.onUse = "Die Klingen werden geschliffen.";
	}
}
