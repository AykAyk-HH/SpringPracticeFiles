package com.expleo.CustomPackageFunctionality.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expleo.CustomPackageFunctionality.entity.Packages;
import com.expleo.CustomPackageFunctionality.service.CustomService;

@Controller
public class CustomController {
	
	private String name,id;
	Packages p;
    
    @Autowired
    CustomService service;
    
    @GetMapping(path = "/addPackage")
    public String addPackages() {
        return "addPackage1"; // Return the view name (addPackage.jsp)
    }
    
    @PostMapping(path = "/savePackage1")
    public String savePackages1(@RequestParam String packageName,String packageId) { 
    	name = packageName;
    	id=packageId;
    	return "addPackage2";
    }
    
    @PostMapping(path = "/savePackage2")
    public String savePackages2(@RequestParam String city,String days) { 
    	//Packages(String packageName, String packageId, String city, String days)
    	p = new Packages(name, id, city, days);
    	service.save(p);
    	return "addPackage2";
    }
    
    @GetMapping(path = "/addMember")
	public String addMembers() {
		
		return "addMember";
		
	}
}