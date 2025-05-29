package com.java.exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter your age");
			int age = sc.nextInt();

			checkVotingEligiblity(age);

		} catch (InvalidVotingAge e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void checkVotingEligiblity(int age) throws InvalidVotingAge {
		if (age < 0 || age > 200) {
			throw new InvalidVotingAge("Invalid Age");
		} else if (age < 18) {
			throw new InvalidVotingAge("Under Age");
		}

	}

}

class InvalidVotingAge extends Exception {// Checked Exception

	public InvalidVotingAge(String message) {
		super(message);

	}

}
