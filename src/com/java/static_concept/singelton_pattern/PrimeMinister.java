package com.java.static_concept.singelton_pattern;

public class PrimeMinister {

	String name;
	int age;
	static private PrimeMinister pm;

//	1. make constructor private
	private PrimeMinister(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	1. make a static helper fn
	static PrimeMinister declarePM(String name, int age) {
		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;
	}

	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

}
