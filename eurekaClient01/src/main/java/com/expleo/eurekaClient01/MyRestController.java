package com.expleo.eurekaClient01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class MyRestController {
	
	@GetMapping("/hi")
	public String welcome() {
		return "Welcome Ayaan";
	}

}
