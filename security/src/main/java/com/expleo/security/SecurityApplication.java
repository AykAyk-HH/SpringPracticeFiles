package com.expleo.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.security.service.MyService;

@SpringBootApplication
public class SecurityApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
	
	@Bean
	public Map<String, String> loadWords(){
		Map<String, String> words = new HashMap<String,String>();
		words.put("MasalaPaan", "A delightfull indian delicacy that feels refreshing in the mouth and also creates beautiful art when spat on the wall");
		words.put("MeethaPaan", "A delightfull indian delicacy that feels refreshing in the mouth that you swallow, good for environment cleanliness");
		return words;
	}

}
