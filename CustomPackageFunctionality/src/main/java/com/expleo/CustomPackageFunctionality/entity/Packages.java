package com.expleo.CustomPackageFunctionality.entity;

import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Packages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNum;
	private String packageName;
	private String packageId;
	private String city;
	private String days;
	public Packages(String packageName, String packageId, String city, String days) {
		super();
		this.packageName = packageName;
		this.packageId = packageId;
		this.city = city;
		this.days = days;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
//	private HashMap<String, Integer> map = new HashMap<>();
	
	
	public void putInMap(String s, int i) {
		
		// map.put("vishal", 10);
	}
	public String getFromMap() {
		//map.get("vishal");
		return null;
	}
	
	public Packages(String packageName, String packageId) {
		super();
		this.packageName = packageName;
		this.packageId = packageId;
//		this.map = map;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
//	public HashMap<String, Integer> getMap() {
//		return map;
//	}
//	public void setMap(HashMap<String, Integer> map) {
//		this.map = map;
//	}

}
