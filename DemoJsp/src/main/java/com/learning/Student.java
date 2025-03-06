package com.learning;

public class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public String getName() {
		return this.name;
	}
}
