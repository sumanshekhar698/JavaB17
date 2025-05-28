package com.java.oops.abstraction.intefaces.specials;



//FunctionalInterface with only and only one abstract method
@FunctionalInterface
public interface Bird {

	void fly();
//	void flys();

	static void eat() {

	};

	default void sleep() {

	};

}
