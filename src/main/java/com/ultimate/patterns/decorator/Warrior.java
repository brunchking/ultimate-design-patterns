package com.ultimate.patterns.decorator;

public class Warrior {
	String name;
	Weapon weapon;

	public Warrior(String name, Weapon weapon) {
		this.name = name;
		this.weapon = weapon;
	}

	public void attack() {
		System.out.print(name);
		weapon.attack();
		System.out.print("\n");
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
