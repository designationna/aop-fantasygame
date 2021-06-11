package Game;

import java.util.List;

public abstract class Item implements buyable, useable {
	protected String onUse;
	protected String name;
	protected List<String> names;
	protected int price;
	protected abstract int genPrice();
	
	Item(List<String> names) {
		this.names = names;
		this.name = this.genName();
		this.price = genPrice();
	}

	@Override
	public void use() {
		if (this.onUse != null) {
			System.out.println("\n" + this.name + " ausgestattet! " + this.onUse);
		}
	}
	
	@Override
	public void buy() {
		System.out.println(this.name + " wurde erworben.");
	}
	
	protected String genName() {
		int randomInt = (int) Math.floor( Math.random() * ( this.names.size() ));
		return this.names.get(randomInt);
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void print() {
		System.out.println(this.name + " (Preis: " + this.price + ")");
	}

}
