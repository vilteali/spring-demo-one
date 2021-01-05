package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class BaseballCoach implements Coach {
	
	// Define a private field for the dependency 
	private PlayBonusService playBonusService;
	
	// Define a constructor for dependency injection
	public BaseballCoach(PlayBonusService playBonusService) {
		this.playBonusService = playBonusService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 15 minutes on batting";
	}

	@Override
	public String getDailyBonus() {
		// Use my playBonusService to get a bonus
		return playBonusService.getBonus();
	}
}
