package com.priyanka.git;

public class Employee {

	
	private String firstname;
	private String lastname;
	private int id;
	private long salary;
	
	
	

	public Employee(String firstname, String lastname, int id, long salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee() {	}
}

