package com.java.oops.encapsulation;

import java.time.LocalDate;

public class Student {

	String name;
	int id;
	private LocalDate dob;

// ----------- final with instance variables -----------
//	Opt 1. assign a final variable directly her in the declaration
	final private Gender gender;

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

//	public Gender setGender(Gender gender) {
//		this.gender = gender;
//	}

	public Student(String name, int id, LocalDate dob, Gender gender) {
		this.name = name;
		this.id = id;
		this.dob = dob;
//		Opt 2. assign a final variable in constructor
		this.gender = gender;
	}

	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", gender=" + gender + "]";
	}

	private void sayMyName() {// Reflections in Java
		System.out.println(name);
	}

}
