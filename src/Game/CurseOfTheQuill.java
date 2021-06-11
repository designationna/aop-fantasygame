package Game;

import java.util.Arrays;
import java.util.List;

public class CurseOfTheQuill extends Scroll {
	protected static List<String> names = Arrays.asList("Der Fluch der Schreibfeder");
	
	CurseOfTheQuill() {
		super(names);
		this.onUse = "Alle Schwerter im Umkreis wurden zerstört.";
	}

	@Override
	protected int genPrice() {
		return 150;
	}
}
