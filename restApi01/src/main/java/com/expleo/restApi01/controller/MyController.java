package com.expleo.restApi01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.restApi01.entity.Nomination;
import com.expleo.restApi01.service.MyService;
import com.expleo.restApi01.service.NominationService;


@RestController
public class MyController {
	
	@Autowired
	MyService service;
	@Autowired
	NominationService dbService;
	
	@PostMapping("/register")
	public ResponseEntity<Nomination> register(@RequestBody Nomination n) {
		Nomination savedNomination = service.addNomination(n);
		final HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<Nomination> re = new ResponseEntity<Nomination>(savedNomination,httpHeader,HttpStatus.ACCEPTED);
		return re;
	}
	
	@PostMapping("/db/register")
	public ResponseEntity<Nomination> registerDB(@RequestBody Nomination n) {
		Nomination savedNomination = dbService.addNomination(n);
		final HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<Nomination> re = new ResponseEntity<Nomination>(savedNomination,httpHeader,HttpStatus.ACCEPTED);
		return re;
	}
	
//	@GetMapping("/searchByName")
//	public ResponseEntity<Nomination> getNominationFor(@RequestParam String name) {
//		System.out.println("getNominationFor() name="+name);
//		Nomination foundNomination=service.findByName(name);
//		final HttpHeaders httpHeader = new HttpHeaders();
//		httpHeader.setContentType(MediaType.APPLICATION_JSON);
//		ResponseEntity<Nomination> re = new ResponseEntity<Nomination>(foundNomination,httpHeader,HttpStatus.ACCEPTED);
//		return re;
//		
//	}
	
	@GetMapping("/searchByName")
	public ResponseEntity<Nomination> getNominationFor(@RequestParam String name) {
		System.out.println("getNominationFor() name="+name);
//		Nomination n = new Nomination(01,"Batman","Crime fighting");
		Nomination foundNomination=service.findByName(name);
		if (foundNomination != null) {
	        return ResponseEntity.ok(foundNomination);
	    } else {
	        return ResponseEntity.noContent().header("204 error", "Data not found check your inputs").build();
	    }
		
	}
	
	@GetMapping("/db/searchByName")
	public Nomination getNominationForDb(@RequestParam String name) {
		System.out.println("getNominationFor() name="+name);
//		Nomination n = new Nomination(01,"Batman","Crime fighting");
		Nomination foundNomination=dbService.findByName(name);
		return foundNomination;
		
	}

	
	@GetMapping("/searchByActivity/{activity}")
	public List<Nomination> getNominationForActivity(@PathVariable String activity) {
		List<Nomination> foundNominations=service.findByActivity(activity);
		
		return foundNominations;
		
	}
	
	@GetMapping("/db/searchByActivity/{activity}")
	public List<Nomination> getNominationForActivityDb(@PathVariable String activity) {
		List<Nomination> foundNominations=dbService.findByActivity(activity);
		
		return foundNominations;
		
	}
	
	@GetMapping("/db/orderByActivity")
	public List<Nomination> sortByActivityDb(){
		
	List<Nomination> orderedList = dbService.sortByActivity();
	return orderedList;
	}
	
	@GetMapping("/db/orderByName")
	public List<Nomination> sortByNameDb(){
		
		List<Nomination> orderedList = dbService.sortByNameMethod();
		return orderedList;
	}
	
//	@ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String handleException(Exception ex) {
//        return ex.getMessage();
//    }
	
//	@ExceptionHandler(Exception.class)
//    @ResponseBody
//    public ResponseEntity<String> handleDataNotFoundException(Exception ex) {
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).header("204 error", ex.getMessage()).build();
//    }

}
