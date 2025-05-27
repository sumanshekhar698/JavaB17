package com.java.oops.inheritance;

import com.java.oops.encapsulation.Gender;

public class Main {

	public static void main(String[] args) {

//		IPLPlayer vk = new IPLPlayer("Virat Kohli", 40, Gender.MALE, "RCB", 9000, 10, 18);
//		System.out.println(vk);
//		System.out.println(vk.name);
//		vk.sayMyName();
//		

		RCBPlayer vk = new RCBPlayer("Virat Kohli", 40, Gender.MALE, "RCB", 9000, 10, 18, 1_000_000_000, 4);
		System.out.println(vk);
		System.out.println(vk.name);
		vk.sayMyName();
//		System.out.println(vk.secret);

	}

}
