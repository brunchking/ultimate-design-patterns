package com.ultimate.patterns.decorator;

public class FireEnchant extends WeaponDecorator {
	public FireEnchant(Weapon weapon) {
		super(5, weapon);
	}

	@Override
	protected void enchanctAttack() {
		super.enchanctAttack();
		System.out.println("burnning...");
	}
}
