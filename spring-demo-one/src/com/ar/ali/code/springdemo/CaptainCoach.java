package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class CaptainCoach implements Coach {
	
	private PlayBonusService playBonusService;
	
	// Create a constructor without arguments
	public CaptainCoach() {
		System.out.println("CaptainCoach: inside the empty constructor");
	}
	
	// Our setter method
	public void setPlayBonusService(PlayBonusService playBonusService) {
		System.out.println("CaptainCoach: inside setter method - setPlayBonusService");
		this.playBonusService = playBonusService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyBonus() {
		return playBonusService.getBonus();
	}

}
