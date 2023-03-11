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

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
	  private final ObjectMapper objectMapper;
	  private final WeatherWearService weatherService;

	    public WeatherController(WeatherWearService weatherService, ObjectMapper objectMapper) {
	        this.objectMapper = objectMapper;
			this.weatherService = weatherService;
	    }

	    @CrossOrigin(origins = "*")
	    @GetMapping("/weather")
	    public String handleWeatherRequest(@RequestParam("data") String jsonString) throws Exception {
	        Weather weather = objectMapper.readValue(jsonString, Weather.class);
	        System.out.println("Temperature: " + weather.getHigh() + ", Condition: " + weather.getCondition());
	    	System.out.println(jsonString);
			weatherService.getOutfit(weather);

	        return weather.getOutfitString();
	    }

}