package com.weatherwear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherwear.model.Weather;
import com.weatherwear.service.WeatherWearService;

//This file creates a REST endpoint at /weather
@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
	 //An object mapper is a java object that takes a JSON string and maps its contents to a Java object
	  private final ObjectMapper objectMapper;
	  private final WeatherWearService weatherService;

	    public WeatherController(WeatherWearService weatherService, ObjectMapper objectMapper) {
	        this.objectMapper = objectMapper;
			this.weatherService = weatherService;
	    }

	    @CrossOrigin(origins = "*")
	    @GetMapping("/weather")
	    // The REST endpoint /weather has a parameter as a JSON string
	    public String handleWeatherRequest(@RequestParam("data") String jsonString) throws Exception {
	    	//When the parameter is received, a weather object is created of it's contents
	    	//System.out.println("Hello");
	    	
	        Weather weather = objectMapper.readValue(jsonString, Weather.class);
	    	System.out.println(jsonString);
	    	//The rule engine is run using the newly created weather object
	    	
			weatherService.getOutfit(weather);

	        return weather.getOutfitString();
	    }

}