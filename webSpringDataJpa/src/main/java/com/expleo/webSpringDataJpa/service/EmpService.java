package com.expleo.webSpringDataJpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.webSpringDataJpa.entity.Emp;
import com.expleo.webSpringDataJpa.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo repo;
	
	public Emp findByEmpno(int empno) {
		Optional<Emp> opt = repo.findById(empno);
		Emp e = opt.get();
		return e;
		
	}
	
	public Emp save(Emp e) {
		 repo.save(e);
		 return e;
	}
	public Iterable<Emp> show(){
		return repo.findAll();
	}
}
