package com.java.oops.abstraction.intefaces;

import java.util.logging.Logger;

//public abstract interface BankInterface {

// An interface can extend to other Interface(s)
public interface BankInterface extends ParentBank, SEBI {

	Logger LOG = Logger.getLogger(BankInterface.class.getName());;

//	int x;// ALL THE VARIABLES THAT YOU DECLARE IN AN INTERFACE ARE public, static,final by default
//	int x;// ALL THE fn/Methods THAT YOU DECLARE IN AN INTERFACE ARE abstract by default
	long checkBalance();

	abstract void deposit(long amount);

	long withdraw(long amount);

//	void test() {
//		
//	}

//	Java 8 onwards . you can have concrete fn/methods in Java with help of static/default
	static void foo() {//
		System.out.println("foo");

	}

	default void bar() {//
		System.out.println("bar");
	}

}
