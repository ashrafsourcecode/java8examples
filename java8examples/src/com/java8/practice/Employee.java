package com.java8.practice;

public class Employee {

	int i;
	String string;
	double d;

	public Employee(int i, String string, double d) {
		this.i = i;
		this.string = string;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [i=" + i + ", string=" + string + ", d=" + d + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int salaryI(int i) {
		return  i+10;
	}

}
