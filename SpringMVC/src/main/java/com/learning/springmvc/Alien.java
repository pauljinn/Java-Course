package com.learning.springmvc;

public class Alien {
	int id;
	String name;
	
	public Alien() {
		System.out.println("Calling constructor");
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		System.out.println("Setting id of alien");
		this.id = id;
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
		System.out.println("Setting name of Alien");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
