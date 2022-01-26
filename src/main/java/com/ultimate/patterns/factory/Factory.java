package com.ultimate.patterns.factory;

import com.ultimate.patterns.factory.domain.Cellphone;
import com.ultimate.patterns.factory.domain.Telephone;

public class Factory {
	public static Phone getPhone(String type) {
		switch(type) {
			case "Cellphone":
				return new Cellphone();
			case "Telephone":
				return new Telephone();
			default:
				return null;
		}
	}
}
