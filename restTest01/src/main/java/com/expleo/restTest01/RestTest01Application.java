package com.expleo.restTest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestTest01Application {

	public static void main(String[] args) {
		System.out.println("consumer02 - Client side Load Balancing");
		SpringApplication.run(RestTest01Application.class, args);
	}

}
