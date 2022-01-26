package com.ultimate.patterns.factory.domain;

import com.ultimate.patterns.factory.Phone;

public class Cellphone implements Phone {
	public void ring() {
		System.out.println("Cellphone ringing...");
	}
}
