package Game;

import java.util.Arrays;
import java.util.List;

public class Bow extends Weapon {
	protected static List<String> names = Arrays.asList("Jagdbogen", "Langbogen", "Reiterbogen");
	
	Bow() {
		super(names);
		this.onUse = "Die Pfeile werden gespannt.";
	}

}
