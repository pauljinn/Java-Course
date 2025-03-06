package com.learning.springcore;

import org.springframework.stereotype.Component;


public class Coder {
	int age;
	Computer laptop;
	
	public Coder() {
		super();
		System.out.println("Creating object");
	}
	
	public Coder(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}
	
	public Computer getLaptop() {
		return laptop;
	}

	public void setLaptop(Computer laptop) {
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("Coding");
		this.laptop.compile();
		
	}

	@Override
	public String toString() {
		return "Coder [age=" + age + "]";
	}
	
	
}
