package com.weatherwear.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherwear.model.Weather;

@Service
public class WeatherWearService {

	//KieContainer is a Drools object used to create a KieSession
	private final KieContainer kieContainer;

	@Autowired
	public WeatherWearService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Weather getOutfit(Weather weather) {
		//KieSession is a Drools object used to run rules
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(weather);
		kieSession.fireAllRules();
		kieSession.dispose();
		return weather;
	}
}