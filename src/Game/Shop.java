package Game;

import java.util.List;
import java.util.Random;

public abstract class Shop {
	protected List<? extends Item> inventory;
	protected String name;
	protected abstract List<? extends Item> generateInventory();
	
	
	Shop(String name) {
		this.name = name;
		this.inventory = this.generateInventory();
		this.printInventory();
	}
	
	protected void printInventory() {
		System.out.println("\n(" + this.name + ") Wilkommen in meinem Laden!");
		for (Item item : inventory) {
			System.out.print("- ");
			item.print();
		}
	}
	
	public Item getCheapestItem() {
		Item cheapestItem = this.inventory.get(0);
		for (Item item : this.inventory) {
			if (item.getPrice() < cheapestItem.getPrice()) {
				cheapestItem = item;
			}
		}
		
		return cheapestItem;
	}
	
	public Item getRandomItem() {
		int rnd = new Random().nextInt(this.inventory.size());
	    return this.inventory.get(rnd);
	}
	
	public Item buy(Item item) {
		try {
			this.inventory.remove(item);
			return item;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
}
