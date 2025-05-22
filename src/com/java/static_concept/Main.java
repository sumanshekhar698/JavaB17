package com.java.static_concept;

public class Main {

	// public static void main(String[] args) ITS A RULE
	public static void main(String[] args) {
		
		
		Student st1 = new Student("Ronny", 20, "DTU");
		
		System.out.println("\n1st");
		System.out.println(st1);
		st1.college = "IIT";
		st1.sayMyCollegeName();
		
		Student st2 = new Student("Alice", 28, "IIIT");
		System.out.println(st2);
		System.out.println("1st end\n");
		
		
		System.out.println("\n2nd");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("2nd end\n");
		
		
		Student st3 = new Student("John", 21, "DTU");
		System.out.println(st3);
		System.out.println(st3.college);
		
		System.out.println();
		System.out.println("\n3rd");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("3rd end\n");
		
		
//		st1.college = "FMS";
		Student.college = "FMS";
		//Its a good habit to access static things through ClassNames instead of object reference
		
		System.out.println();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		

	}

}
