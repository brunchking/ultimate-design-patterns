package com.ultimate.patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Sword sword = new Sword();
		Weapon fireSword = new FireEnchant(sword);
		Weapon holyfilreSword = new HolyEnchant(fireSword);
		
		Warrior warrior = new Warrior("Ricardo", sword);
		warrior.attack();
		warrior.setWeapon(fireSword);
		warrior.attack();
		warrior.setWeapon(holyfilreSword);
		warrior.attack();
	}
}
