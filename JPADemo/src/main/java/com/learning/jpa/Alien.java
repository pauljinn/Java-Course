package com.learning.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien")
public class Alien {
	@Id
	int aid;
	String color;
	String fName;
	String mName;
	String lName;
	
	public Alien() {
		super();
	}
	
	public Alien(int aid, String color, String fName, String mName, String lName) {
		super();
		this.aid = aid;
		this.color = color;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}

	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", color=" + color + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName
				+ "]";
	}
	
	
	
	
}
