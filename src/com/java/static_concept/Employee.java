package com.java.static_concept;

public class Employee {
	String name;
	int age;
	String id;// Auto Generate IDs EMP1, EMP2, EMP3
	static int counter = 0;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = "EMP" + ++counter;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
