package Game;

import java.util.ArrayList;
import java.util.List;

public class Bookstore extends Shop {
	protected List<? extends Scroll> inventory;

	Bookstore() {
		super("Buchhandlung");
	}
	
	protected List<? extends Scroll> generateInventory() {
		int min = 1;
		int max = 10;
		int randomInt1 = (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		int randomInt2= (int) Math.floor( Math.random() * ( max - min + 1 ) + min );
		
		List<Scroll> scrolls = new ArrayList<>();
		
		for (int i = 0; i < randomInt1; i++) {
			scrolls.add(new EyesOfHypnos());
		}
		
		for (int i = 0; i < randomInt2; i++) {
			scrolls.add(new CurseOfTheQuill());
		}

		return scrolls;
	}
}
