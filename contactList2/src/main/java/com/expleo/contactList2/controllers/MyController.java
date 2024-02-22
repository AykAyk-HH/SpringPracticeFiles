package com.expleo.contactList2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expleo.contactList2.contactData.ContactsClass;

@Controller
public class MyController {
	ContactsClass c = new ContactsClass();
	
	@GetMapping(path = "/addContact")           //@GetMapping(path = "empForm")
	public String addNew() {
		
		return "saveContact";
		
	}
	
	@GetMapping(path = "/showContact")           //@GetMapping(path = "empForm")
	public String showAll(Model model) {
		
		model.addAttribute("list",c.getH() );
		return "showContacts";
		
	}
	
	@GetMapping(path = "/submitNum")
	public String SaveNewContact(@RequestParam String name,@RequestParam String num) {
		c.add(name, num);
		return "saveSuccess";
		
	}

}
