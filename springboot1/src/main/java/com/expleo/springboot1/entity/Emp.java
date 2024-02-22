package com.expleo.springboot1.entity;


public class Emp{
	int empno;
	String name;
	float salary;

	
	
	public int getEmpno() {
		return empno;
	}



	public String getName() {
		return name;
	}



	public float getSalary() {
		return salary;
	}



	public void setEmpno(int empno) {
		this.empno = empno;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Emp(){
		System.out.println("Emp constructor()");
	}

	public Emp(int empno, String name, float salary) {
		System.out.println("Emp constructor() parameterized");
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}


}
