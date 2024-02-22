package com.expleo.webSpringDataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.expleo.webSpringDataJpa.entity.Emp;
import com.expleo.webSpringDataJpa.service.EmpService;

import jakarta.validation.Valid;


@Controller
public class EmpController implements WebMvcConfigurer {
	
	@Autowired
	EmpService service;
	
	
//	@GetMapping(path = "/searchEmp")           //@GetMapping(path = "empForm")
//	public String empSearch() {
//		return "getEmpDets";
		
//	}
	
	
	@GetMapping(path = "/searchEmp")           //@GetMapping(path = "empForm")
	public String empSearch(@RequestParam int empno,Model model) {
		System.out.println("Emp no : "+empno);
		if(empno<=0)
		{
			throw new IllegalArgumentException("empno" +empno+" is not valid");
		}
		Emp e = service.findByEmpno(empno);
		model.addAttribute("e", e);
		return "showEmpDets";
		
	}
	
	@GetMapping(path = "saveEmp")
	public String saveAnEmp(@ModelAttribute(name = "emp") Emp e,BindingResult br) {
		return "getEmpDets";
	}
	
	@PostMapping(path = "submitEmp")
	public String saveEmp(@Valid @ModelAttribute(name = "emp") Emp e, BindingResult br) {
		System.out.println("@PostMapping saveEmp() br.hasErrors()=" + br.hasErrors());
		if (br.hasErrors() == true) {
			System.out.println("Errors exist in Emp e=" + e);
			return "getEmpDets";
		}
		else 
		{
			System.out.println("No Errors found in Emp e=" + e);
		service.save(e);
		return "saveSuccess";
		}
		
	}
	
	@GetMapping(path = "/showAll")
	public String showEmps(Model model) {
		Iterable<Emp> itr = service.show();
		model.addAttribute("itr", itr);
		return "showEmps";
		
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, Model model) {
		model.addAttribute("exc", ex.getMessage());
		return "errorPage";
		
	}
	
	

}

