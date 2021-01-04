package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice 15 minutes on batting";
	
	}
}
