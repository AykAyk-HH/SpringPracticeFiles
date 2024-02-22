package com.expleo.restApi01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.expleo.restApi01.entity.Nomination;

@SpringBootApplication
public class RestApi01Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApi01Application.class, args);
	}
	
	@Bean
	public List<Nomination> loadNominations(){
		List<Nomination> nomList = new ArrayList<Nomination>();
		nomList.add(new Nomination(1,"LoverBoy","Looking 4 her"));
		nomList.add(new Nomination(2,"StalkerBoy","Stalking her"));
		nomList.add(new Nomination(3,"HungryBoy","Eating"));
		
		return nomList;
		
	}

}
