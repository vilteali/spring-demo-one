package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class TrackCoach implements Coach {

	private PlayBonusService playBonusService;
	
	public TrackCoach(PlayBonusService playBonusService) {
		this.playBonusService = playBonusService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyBonus() {
		return "Just Do It: "+ playBonusService.getBonus();
	}
	
	// Add a init method
	public void doInitMethod() {
		System.out.println("TrackCoach: inside method doInitMethod");
	}
	
	// Add a destroy method
	public void doDestroyMethod() {
		System.out.println("TrackCoach: inside method doDestroyMethod");
	}
}
