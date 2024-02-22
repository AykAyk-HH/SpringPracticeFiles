package com.expleo.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.expleo.springboot1.entity.Emp;

@Controller
public class EmpController {
	
	@GetMapping("empForm")           //@GetMapping(path = "empForm")
	public String empForm() {
		
		return "getEmpDets";
		
	}
	
//	@RequestMapping(method = RequestMethod.GET, path = "submitEmp")
	@GetMapping("submitEmp")
	public String saveEmpDetails(Emp emp, Model model) {
		
//		Emp e1 = new Emp(empno,name,salary);
		model.addAttribute("empDets", emp);
		
		return "showEmpDets";
		
	}
//	@GetMapping("submitEmp")
//	public String saveEmpDetails(@RequestParam int empno,@RequestParam String name,@RequestParam float salary, Model model) {
//		
//		Emp e1 = new Emp(empno,name,salary);
//		model.addAttribute("empDets", e1);
//		
//		return "showEmpDets";
//		
//	}
	
	

}

