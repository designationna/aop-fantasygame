package Game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int gold = 1000;
	private int combatStrength = 0;
	private List<Item> inventory = new ArrayList<Item>();
	private List<Silverring> equipedSilverrings = new ArrayList<Silverring>();
	
	Player(String name) {
		this.name = name;
		this.printPlayer();
	}
	
	public List<Item> getInventory() {
		return this.inventory;
	}
	
	public void printPlayer() {
		System.out.println(this.name + ": ");
		this.printCombatStrength();
		this.printWallet();
		this.printInventory();
	}
	
	public void printCombatStrength() {
		this.calcCombatStrength();
		System.out.println(this.name + " hat eine Kampfstärke von " + this.combatStrength + ".");
	}
	
	public void printWallet() {
		System.out.println(this.name + " hat noch " + this.gold + " Gold.");
	}
	
	public void printInventory() {
		System.out.println("Momentan in " + this.name + "s Rucksack:");
		if (this.inventory != null && this.inventory.size() > 0) {
			for (Item item : this.inventory) {
				System.out.print("- ");
				item.print();
			}
		} else {
			System.out.println("- " + this.name + " hat keine Items im Rucksack.");
		}
	}
	
	private void calcCombatStrength() {
		int summedCombatStrength = 0;
		for (Silverring silverring : equipedSilverrings) {
			summedCombatStrength += silverring.getCombatStrength();
		}
		this.combatStrength = summedCombatStrength;
	}
	
	public boolean canAffordItemsFrom(List<Shop> shops) {
		for (Shop shop : shops) {
			if (shop.getCheapestItem().getPrice() < this.gold) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean buyFrom(Shop shop) {
		Item item = shop.getRandomItem();
		
		if (item.getPrice() <= this.gold) {
			this.buy(shop, item);
		} else {
			item = shop.getCheapestItem();
			if (item.getPrice() <= this.gold) {
				this.buy(shop, item);
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean buy(Shop shop, Item item) {
		try {
			if (this.gold >= item.getPrice()) {
				this.inventory.add(shop.buy(item));
				this.gold -= item.getPrice();
				System.out.println("\n" + item.getName() + " wurde für " + item.getPrice() + " gekauft.");
				this.printWallet();
				this.printInventory();
			} else {
				throw new Exception("Nicht genügend Geld.");
			}
		} catch (Exception e) {
			System.out.println("Du kannst dieses Item nicht kaufen! " + e);
		}
		return true;
	}
	
	public void use(Item item) {
		item.use();
		if (item instanceof Silverring) {
			this.equip(item);
		}
	}
	
	public void equip(Item item) {
		if(!this.equipedSilverrings.contains(item) && item instanceof Silverring) {
			this.equipedSilverrings.add((Silverring) item);
		}
	}
}
