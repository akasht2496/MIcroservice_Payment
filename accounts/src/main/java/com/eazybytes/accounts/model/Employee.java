package com.eazybytes.accounts.model;

public class Employee {
	private int empid;
	private String name;
	private Double Salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}
	public Employee(int empid, String name, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}
	public Employee() {
		super();
	}
	
	

}
