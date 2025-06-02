package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSorting {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(34, "Sam"));
		list.add(new Student(34, "Sam"));
		list.add(new Student(3, "Irwin"));
		list.add(new Student(43, "Samantha"));
		list.add(new Student(21, "Sameer"));
		list.add(new Student(2, "John"));
		
		list.forEach(System.out::println);//TODO
		
//		Collections.sort(list);

	}

}

class Student {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
