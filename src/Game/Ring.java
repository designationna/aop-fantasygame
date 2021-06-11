package Game;

import java.util.List;

public abstract class Ring extends Item {
	
	Ring(List<String> names) {
		super(names);
	}
	
	@Override
	protected void print() {
		System.out.println(this.name + " (Preis: " + this.price + ")");
	}
}
