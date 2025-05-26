package com.java.oops.encapsulation;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("John", 4, LocalDate.of(1994, 1, 18), Gender.MALE);
		System.out.println(s1);
		
//		s1.gender = Gender.FEMALE;
		System.out.println(s1.getGender());
		s1.setDob( LocalDate.of(1995, 1, 18));
		
		System.out.println(s1);
		

	}

}
