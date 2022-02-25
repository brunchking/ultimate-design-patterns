package com.ultimate.patterns.decorator;

public class Sword implements Weapon{
	private int hitPoint = 10;
	
	@Override
	public int getHitPoint() {
		return this.hitPoint;
	}

	@Override
	public void attack() {
		System.out.println(" deal " + this.hitPoint + " damage!");
	}

}
