package com.ultimate.patterns.abstracttest;

public abstract class AbstractTest {
	public void greeting() {
		this.say();
	}
	
	public void say() {
		System.out.println("Hello!");
	}
}
