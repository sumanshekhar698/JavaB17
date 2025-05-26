package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {

		ShapePolymorphic sp = new ShapePolymorphic();
		System.out.println(sp.area(4.0));// Circle

		System.out.println(sp.area(10, 4.0f));// Triangle

		System.out.println(sp.area(10.0f, 4));// ||gram
		

	}

}
