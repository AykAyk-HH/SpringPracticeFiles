package com.expleo.security.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	
	@Autowired
	Map<String, String> words;

	public String getMeaning(String word) {
		
		String meaning = words.get(word);
		return meaning;
		
	}
	

}
