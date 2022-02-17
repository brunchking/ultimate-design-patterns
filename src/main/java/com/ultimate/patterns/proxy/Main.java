package com.ultimate.patterns.proxy;

public class Main {
	public static void main(String[] args) {
		Subject subject = new Proxy(new RealSubject());
		subject.service();
	}
}
