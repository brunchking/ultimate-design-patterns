package com.ultimate.patterns.decorator;

public abstract class WeaponDecorator implements Weapon{
	private int hitPoint;
	protected Weapon weapon;

	public WeaponDecorator(int hitPoint, Weapon weapon) {
		this.hitPoint = hitPoint;
		this.weapon = weapon;
	}
	
	@Override
	public int getHitPoint() {
		return this.hitPoint + this.weapon.getHitPoint();
	}
	
	@Override
	public void attack() {
		System.out.println(" deal " + (this.hitPoint + this.weapon.getHitPoint()) + " damage!");
		this.enchanctAttack();
	}
	
	protected void enchanctAttack() {
		if (weapon instanceof WeaponDecorator) {
			WeaponDecorator deco = (WeaponDecorator) weapon;
			deco.enchanctAttack();
		}
	}
}
