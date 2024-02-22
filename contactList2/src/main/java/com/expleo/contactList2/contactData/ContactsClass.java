package com.expleo.contactList2.contactData;

import java.util.HashMap;

public class ContactsClass {
	private HashMap<String,String> h = new HashMap<>();

	public HashMap<String, String> getH() {
		return h;
	}

	public void setH(HashMap<String, String> h) {
		this.h = h;
	}
	 public void add(String a,String b) {
		 h.put(a, b);
	 }

}
