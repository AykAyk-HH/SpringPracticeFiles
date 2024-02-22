package com.expleo.hiRestApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Value("${server.port}")
	private String portNum;

	@GetMapping("/{name}")
	public String sayHi(@PathVariable String name) {
		return "Hi "+name+" port number = "+portNum;
		
	}

}
