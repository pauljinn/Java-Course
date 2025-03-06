package com.learning.spring;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
@Component
public class Student {
	@Id
	int rollNo;
	String name;
	int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( int rollNo, String name, int marks) {
		super();
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
