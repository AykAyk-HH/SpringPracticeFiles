package com.expleo.addEmpService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.expleo.addEmpService.entity.Emp;
import com.expleo.addEmpService.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@PostMapping("/emp/add")
	public ResponseEntity<Emp> registerDB(@RequestBody Emp n) {
		Emp savedEmp = service.save(n);
		final HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<Emp> re = new ResponseEntity<Emp>(savedEmp,httpHeader,HttpStatus.ACCEPTED);
		return re;
	}
}
