package com.expleo.addEmpService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddEmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddEmpServiceApplication.class, args);
	}

}
