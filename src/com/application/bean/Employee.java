package com.application.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String address;
	private Date dob;

	public Employee(int id, String name, Date dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	@Override
	public String toString() {
		return "Employee name= " + getName() + ", address= " + getAddress() + ", dob= " +  sdf.format(dob) + " Id= " + getId() 
				+ "\n";
	}

	@Override
	public int compareTo(Employee o) { // TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());

	}

}
