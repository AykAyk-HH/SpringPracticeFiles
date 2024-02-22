package com.expleo.consumer01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@GetMapping("/capitalize")
	public String capitalize() {
		
		String str = null;
		RestTemplate restTemplate = new RestTemplate();
		str = restTemplate.getForObject("http://10.192.18.176:8080/hi", String.class);
		return str.toUpperCase();
	}

}
