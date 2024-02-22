package com.expleo.restApi01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import com.expleo.restApi01.entity.Nomination;

public interface NominationRepo extends ListCrudRepository<Nomination, Integer> {
	
	public List<Nomination> findAllByOrderByActivity();
	
	@Query("select nom from Nomination nom order by nom.name")
	public List<Nomination> sortByName();

}
