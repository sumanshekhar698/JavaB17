package com.java.static_concept;

public class Student {

	String name;// instance var
	int age;// instance var
	static String college;// static var
//	R0: static things are initialized before even Object creation
//	R1: static variables are not INSTANCE variables
//	R2: static means Class level not object level
//	R3: static variable and fn are shared among all the objects of that class

	/*
	 * << Execution Order >>
	 * 1. Static Blocks in Order 2. Normal Blocks 3. Constructors
	 */
	{
		System.out.println("Block 1");
	}

	static {
		System.out.println("Static Block 2");
		college = "Please asign a college name";
	}

	{
		System.out.println("Block 3");
	}

	static {
		System.out.println("Static Block 4");
	}

	Student(String name, int age, String college) {
		System.out.println("Student() <<");
		this.name = name;
		this.age = age;
		this.college = college;
		System.out.println("Student() >>");
	}

//	R4:  static things CAN be do DIrtectly  accessed inside non static context
	void sayMyCollegeName() {
		System.out.println(college);
		System.out.println(name);
	}

//	R5: Non static things cannot be directly accessed inside static context/fn/blocks
	static void sayMyName() {
//		System.out.println(name);
		System.out.println(college);

	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", college=" + college + "]";
	}

}
