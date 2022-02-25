package com.ultimate.patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Sword sword = new Sword();
		FireEnchant filreSword = new FireEnchant(sword);
		
		Warrior warrior = new Warrior("Ricardo", sword);
		warrior.attack();
		warrior.setWeapon(filreSword);
		warrior.attack();
	}
}
