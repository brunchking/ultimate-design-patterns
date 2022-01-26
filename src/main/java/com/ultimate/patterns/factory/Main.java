package com.ultimate.patterns.factory;

public class Main {

	public static void main(String[] args) {
		String type = "Cellphone";
		Phone phone = null;
		switch(type) {
			case "Cellphone":
				phone = Factory.getPhone("Cellphone");
				break;
			case "Telephone":
				phone = Factory.getPhone("Telephone");
				break;
			default:
				break;
		}
		phone.ring();
	}

}
