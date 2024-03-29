package com.expleo.finalProject1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial_num;
	private String groupId;
	private String packageId;
	private String startDate;
	private int cost;
	
	public Bookings() {
		
	}
	
	
	public Bookings(String groupId, String packageId, String startDate,int cost) {
		this.groupId = groupId;
		this.packageId = packageId;
		this.startDate = startDate;
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
