package com.tutorial.hibernate;

import javax.persistence.Embeddable;

@Embeddable//to put a object inside a entity object
public class SnameModel {
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SnameModel [fname=").append(fname).append(", lname=").append(lname).append("]");
		return builder.toString();
	}
	

}
