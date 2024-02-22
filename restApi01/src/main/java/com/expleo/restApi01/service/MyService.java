package com.expleo.restApi01.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.expleo.restApi01.entity.Nomination;

@Service
public class MyService {
	
	@Autowired
	List<Nomination> nomList; //= new ArrayList<Nomination>();
	private int id;
	
	public Nomination addNomination(Nomination nomination) {
		id++;
		nomination.setId(id);
		nomList.add(nomination);
		return nomination;
	}
	
	public Nomination findByName(String name) {
		Nomination foundNomination = null;
		for (Nomination nomination : nomList) {
			if(nomination.getName().equals(name) == true) {
				foundNomination = nomination;
				break;
			}
		}
		return foundNomination;
	}
	public List<Nomination> findByActivity(String activity) {
		List<Nomination> filterList = nomList.stream()
                .filter(nom -> nom.getActivity().equals(activity))
                .collect(Collectors.toList());
		
		return filterList;
	}

}
