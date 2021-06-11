package Game;

import java.util.ArrayList;
import java.util.List;

public class Jeweller extends Shop {
	Jeweller() {
		super("Juwellier");
	}
	
	protected List<? extends Ring> generateInventory() {
		int min = 1;
		int max = 10;
		int randomInt1 = (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		int randomInt2= (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		
		List<Ring> rings = new ArrayList<>();
		
		for (int i = 0; i < randomInt1; i++) {
			rings.add(new Goldring());
		}
		
		for (int i = 0; i < randomInt2; i++) {
			rings.add(new Silverring());
		}

		return rings;
	}
}
