package com.java.basics;

public class SwitchCase {

	public static void main(String[] args) {

		int input = 2;

//		menu driven program
		switch (input) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;

		default:
			System.out.println("Default");
			break;
		}

	}

}
