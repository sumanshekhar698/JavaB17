package com.advance.multithreading;

public class PrimeMinister {//Singelton pattern

	String name;
	int age;
	static private PrimeMinister pm;

//	1. make constructor private
	private PrimeMinister(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	1. make a static helper fn
//	Syncronization Problem :: synchronized to solve it
	static synchronized PrimeMinister declarePM(String name, int age) {
		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;
	}

	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

}
