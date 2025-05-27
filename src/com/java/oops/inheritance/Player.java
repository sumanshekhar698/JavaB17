package com.java.oops.inheritance;

import com.java.oops.encapsulation.Gender;

public class Player extends Object{//Object class

	String name;
	int age;
	Gender gender;
	private int secret = 998;//Private things don't get inherited , be it a fn or instance variable

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public Player(String name, int age, Gender gender) {
//		super();
		System.out.println("Player(String name, int age, Gender gender) called");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	void sayMyName() {
		System.out.println(name);
	}

}
