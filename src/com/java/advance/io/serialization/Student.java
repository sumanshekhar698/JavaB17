package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {//Serializable is marker interface

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	transient int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student st) {
		if (this.rollNo == st.rollNo)
			return 0;

		else if (this.rollNo < st.rollNo)
			return 1;//any +ve no
		else
			return -1;//any -ve no

	}


}
