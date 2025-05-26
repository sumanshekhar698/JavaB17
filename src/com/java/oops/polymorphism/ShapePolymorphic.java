package com.java.oops.polymorphism;

public class ShapePolymorphic {

//	Rules of CompileTime Polymorphism::  Method Overloading
	
//	AGENGA: To make a fn unique
//	0. fn name
//	1. No of fn paramters
//	2. Parameter type
//	3. Parameter Position with different param types

//	NOTE! fn return type does not has anything to do with polymorphism

//	Polymorphism has 2 type
//	1. Method/fn Overloading :: CompileTime Polymorphism
//	2. Method Overiding :: Runtime Polymorphism

//	area() fn is overloaded
	int area(int side) {
		return side * side;
	}

	double area(double radius) {
//		return 3.14159 * radius * radius;

		return Math.PI * radius * radius;

	}

	int area(int l, int b) {
		return l * b;
	}

	float area(int base, float height) {
		return 0.5f * base * height;
	}

	float area(float height, int base) {
		return base * height;
	}

	/*
	 * void details() {
	 * 
	 * }
	 * 
	 * void details(String msg) {
	 * 
	 * }
	 */

}
