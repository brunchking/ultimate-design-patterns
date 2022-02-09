package com.ultimate.patterns.builder;

import com.ultimate.patterns.builder.model.User;

public class Main {
	public static void main(String[] args) {
		User user = new UserBuilder()
				.setId(69)
				.setAge(25)
				.setFirstName("Ricardo")
				.setLastName("Millos")
				.build();
	}
}
