package Game;

import java.util.Arrays;
import java.util.List;

public class Goldring extends Ring {
	protected static List<String> names = Arrays.asList("Goldring");
	
	Goldring() {
		super(names);
		this.onUse = "Alle Monster wurden gezähmt.";
	}

	@Override
	protected int genPrice() {
		return 220;
	}
}
