package com.expleo.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.expleo.security.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	MyService service;
	
	@GetMapping("/")
	public String index() {
		return "redirect:index.jsp";
		
	}
	
	@GetMapping(path = "/hello")
	public String showHelloPage() {
		return "Hello";
		
	}
	
	@GetMapping(path = "/findMeaning")
	public String getMeaning1(@RequestParam String word,Model model) {
		
		String meaning = service.getMeaning(word);
		model.addAttribute("meaning", meaning);
		model.addAttribute("word", word);
		return "showMeaning";
		
	}

}
