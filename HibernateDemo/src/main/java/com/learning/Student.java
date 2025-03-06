package com.learning;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptops;
	
	@ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
	private List<ClassRoom> classRooms;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", laptops=" + laptops + ", classRooms=" + classRooms + "]";
	}
	
	

	
}
