package com.java.oops.intro;

import java.util.Scanner;
//import java.util.*;
//import java.lang.*;

public class TakeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Guess a number");

		int input = sc.nextInt();

		System.out.println("Guessed number is : " + input);
		
		String str = "Suman";
		
		sc.close();
		


	}

}
