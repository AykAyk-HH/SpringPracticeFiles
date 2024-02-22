package com.expleo.addEmpService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.addEmpService.entity.Emp;
import com.expleo.addEmpService.repo.EmpRepo;


@Service
public class EmpService {
	
	@Autowired
	EmpRepo repo;
	
	
	public Emp save(Emp e) {
		 repo.save(e);
		 return e;
	}
}
