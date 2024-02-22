package com.expleo.consumer02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@GetMapping("/{number}/decorate")
	public String decorate(@PathVariable int number) {
		String str = null;
		String stars = "";
		for(int i=number;i>0;i--) {
			stars = stars + "*";
		}
		RestTemplate restTemp = new RestTemplate();
		str = restTemp.getForObject("http://10.192.18.176:8080/hi", String.class);
		str = stars + str + stars;
		return str;
		
	}

}
