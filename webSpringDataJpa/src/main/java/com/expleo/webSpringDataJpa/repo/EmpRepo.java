package com.expleo.webSpringDataJpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.expleo.webSpringDataJpa.entity.Emp;


public interface EmpRepo extends CrudRepository<Emp, Integer>{

}
