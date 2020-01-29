package com.hackerrank.javase.entity;

public class Student {
	
	private int id;
	
	private double cgpa;
	
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", cgpa=" + cgpa + ", lastName=" + lastName + "]";
	}

	public Student(int id, double cgpa, String lastName) {
		super();
		this.id = id;
		this.cgpa = cgpa;
		this.lastName = lastName;
	}
	
	

}
