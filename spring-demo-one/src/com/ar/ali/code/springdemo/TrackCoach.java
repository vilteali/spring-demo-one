package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
