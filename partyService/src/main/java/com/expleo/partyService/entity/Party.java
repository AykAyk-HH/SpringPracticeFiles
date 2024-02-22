package com.expleo.partyService.entity;

import java.sql.Time;
import java.util.Date;

public class Party {
	//name,date,time,venue
	
	private String name;
	private String date;
	private String time;
	private String venue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	

}
