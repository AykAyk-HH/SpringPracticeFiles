package com.expleo.CustomPackageFunctionality.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.CustomPackageFunctionality.entity.Packages;
import com.expleo.CustomPackageFunctionality.repo.CustomRepo;

@Service
public class CustomService {
	
	@Autowired
	CustomRepo repo;
	
	public void save(Packages p) {
		repo.save(p);
	}

}
