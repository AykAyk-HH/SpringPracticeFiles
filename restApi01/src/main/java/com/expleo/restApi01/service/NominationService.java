package com.expleo.restApi01.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.restApi01.entity.Nomination;
import com.expleo.restApi01.repo.NominationRepo;

@Service
public class NominationService {
	
	@Autowired
	NominationRepo repo;
	public Nomination addNomination(Nomination nomination) {
		
		return repo.save(nomination);
	}
	
	public Nomination findByName(String name) {
		Nomination foundNomination = null;
		List<Nomination> tempList = repo.findAll();
		for (Nomination nomination : tempList) {
			if(nomination.getName().equals(name) == true) {
				foundNomination = nomination;
				break;
			}
		}
		return foundNomination;
	}
	
	
	
	public List<Nomination> findByActivity(String activity) {
		List<Nomination> filterList = repo.findAll().stream()
                .filter(nom -> nom.getActivity().equals(activity))
                .collect(Collectors.toList());
		
		return filterList;
	}
	
	public List<Nomination> sortByActivity(){
		return repo.findAllByOrderByActivity();
	}
	
	public List<Nomination> sortByNameMethod(){
		return repo.sortByName();
	}

}
