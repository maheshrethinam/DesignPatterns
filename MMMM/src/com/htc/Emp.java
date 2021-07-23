package com.htc;

public class Emp {
	
	
	private int id;
	private String name;
	private Double salary;
	private int age;
	private String dept;
	
	
	public Emp(int id, String name, Double salary, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
