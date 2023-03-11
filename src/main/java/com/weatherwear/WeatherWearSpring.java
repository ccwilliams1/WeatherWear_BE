package com.weatherwear;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//Run this file to run the application
@SpringBootApplication
public class WeatherWearSpring {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWearSpring.class, args);
		System.out.println("Listening on 8080");
	}
	
	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

}
