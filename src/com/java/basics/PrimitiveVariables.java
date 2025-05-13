package com.java.basics;//R1: package name must be declared

//R2: class name should exactly match file name
class PrimitiveVariables {// C1: class name should be PascalCase

	public static void main(String[] args) {

//		Numbers or Integers are stored using 2s complement

//		Range of a integer datatype with bits n ::   -2^(n-1) to +2^(n-1) - 1

		byte a = 43;
		short b = 89;
		int valueOfDozen = 12;// num is a variable of type int
//		variable and fn/method names we follow camelCase
		long phoneNumber = 9998887776L;

//		Float is stored using IEEE
		float valueOfPi = 3.141592653589793F; 
		double valueOfPiPrecised = 3.141592653589793;
		System.out.println(valueOfPi);
		System.out.println(valueOfPiPrecised);
		
//		Boolean data
		boolean isJavaEasy = false;
		isJavaEasy = true;
		
//		$_ are allowed in variable names, and number are allowed in between
		
//		Character data
//		ASCII
//		UTF 8
//		UTF 16
		char ch = 'g';
		
		

	}
//	gambhirJha

}