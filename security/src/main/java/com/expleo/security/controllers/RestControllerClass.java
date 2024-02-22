package com.expleo.security.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.security.service.MyService;

@RestController
public class RestControllerClass {
	
	@Autowired
	MyService service;
	
	@GetMapping(path="/justHello")
	public String helloWithRest() {
		return "Hi Hunky Hunk, from Rest controller";
		
	}
	
	@GetMapping(path = "/rs/findMeaning")
	public String getMeaning2(@RequestParam String word) {
		
		String meaning = service.getMeaning(word);
		String mean = "The meaning from rest of "+word+" is "+meaning;
		return mean;
		
	}
	
	

}
