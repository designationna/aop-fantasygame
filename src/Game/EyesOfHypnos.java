package Game;

import java.util.Arrays;
import java.util.List;

public class EyesOfHypnos extends Scroll {
	protected static List<String> names = Arrays.asList("Die Augen von Hypnos");
	
	EyesOfHypnos() {
		super(names);
		this.onUse = "Alle Monster wurden gelähmt.";
	}

	@Override
	protected int genPrice() {
		return 180;
	}
}
