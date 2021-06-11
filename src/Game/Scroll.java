package Game;

import java.util.List;

public abstract class Scroll extends Item {
	
	Scroll(List<String> names) {
		super(names);
	}
	
	@Override
	protected void print() {
		System.out.println(this.name + " (Preis: " + this.price + ")");
	}
}
