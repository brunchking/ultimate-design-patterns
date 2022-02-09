package com.ultimate.patterns.builder;

import com.ultimate.patterns.builder.model.User;

public class UserBuilder {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String gender;
	private String phone;

	public UserBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public UserBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public UserBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public UserBuilder setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public User build() {
		return new User(id, age, firstName, lastName, email, address, gender, phone);
	}
}
