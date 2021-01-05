package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class CaptainCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private PlayBonusService playBonusService;
	
	// Create a constructor without arguments
	public CaptainCoach() {
		System.out.println("CaptainCoach: inside the empty constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CaptainCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("CaptainCoach: inside setter method - setTeam");
		this.team = team;
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
