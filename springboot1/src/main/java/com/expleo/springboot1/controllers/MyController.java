package com.expleo.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello1() {
		System.out.println("Mycontoller()::hello");
		return "helloSpringBoot";
	}
		
		@RequestMapping(method = RequestMethod.GET, path = "square")
		public String showSquareInput() {
			System.out.println("Mycontoller()::square");
			return "squareInput";
	}
		@RequestMapping(method = RequestMethod.GET, path = "capitalize")
		public String showCapitalizeInputPage() {
			System.out.println("Mycontoller()::name");
			return "capitalizeName";
		}
		
		@RequestMapping(method = RequestMethod.GET, path = "calculateSquare")
		public String calculateSquare(@RequestParam(name = "num")int n, Model model) {
			System.out.println("The number is : "+n);
			model.addAttribute("num", n);
			model.addAttribute("square", (n*n));
			return "squareShow";
			
		}
		
		@RequestMapping(method = RequestMethod.GET, path = "capitalizeName")
		public String capitalizeName(@RequestParam(name = "name")String n, Model model) {
			model.addAttribute("name", n);
			model.addAttribute("capitalName", n.toUpperCase());
			return "showCapitalized";
			
		}
		
}
