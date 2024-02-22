package com.expleo.restApi01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nomination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String activity;
	
	public  Nomination() {
		// TODO Auto-generated constructor stub
	}
		
		
	
	public Nomination(int id, String name, String activity) {
		super();
		this.id = id;
		this.name = name;
		this.activity = activity;
	}



	@Override
	public String toString() {
		return "NomineeDetails [id=" + id + ", name=" + name + ", activity=" + activity + "]";
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
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}

}
