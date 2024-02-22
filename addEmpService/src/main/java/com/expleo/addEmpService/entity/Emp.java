package com.expleo.addEmpService.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp{
	
	@Id
	private int empno;
	
	private String name;
	
	private float salary;

	
	
	public int getEmpno() {
		return empno;
	}



	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
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
//		System.out.println("Emp constructor() parameterized");
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}


}
