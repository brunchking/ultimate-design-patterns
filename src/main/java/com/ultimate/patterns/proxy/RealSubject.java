package com.ultimate.patterns.proxy;

public class RealSubject implements Subject{
	@Override
	public void service() {
		System.out.println("Do service");
	}
}
