package com.expleo.addEmpService.repo;

import org.springframework.data.repository.CrudRepository;

import com.expleo.addEmpService.entity.Emp;

public interface EmpRepo extends CrudRepository<Emp, Integer>{

}