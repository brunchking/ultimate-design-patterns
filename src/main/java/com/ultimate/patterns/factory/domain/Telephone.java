package com.ultimate.patterns.factory.domain;

import com.ultimate.patterns.factory.Phone;

public class Telephone implements Phone {
	public void ring() {
		System.out.println("Telephone ringing...");
	}
}
