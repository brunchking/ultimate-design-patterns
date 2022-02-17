package com.ultimate.patterns.proxy;

public class Proxy implements Subject{
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override 
	public void service() {
		System.out.println("Before do service");
		this.subject.service();
		System.out.println("After do service");
	}
}
