package com.kafka.consumerdemo.beans;

public class User {

	private String name;
	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public User(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", department=" + department + "]";
	}

}
