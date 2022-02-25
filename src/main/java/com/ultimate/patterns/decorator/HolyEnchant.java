package com.ultimate.patterns.decorator;

public class HolyEnchant extends WeaponDecorator{
	public HolyEnchant(Weapon weapon) {
		super(3, weapon);
	}

	@Override
	protected void enchanctAttack() {
		super.enchanctAttack();
		System.out.println("healing...");
	}
}
