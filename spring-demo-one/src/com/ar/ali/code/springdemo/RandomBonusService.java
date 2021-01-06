package com.ar.ali.code.springdemo;

import java.util.Random;

import com.ar.ali.interfaces.springdemo.BonusService;

public class RandomBonusService implements BonusService {
	
	private Random myRandom = new Random();

	// Create an array of strings
	private String[] data = {
			"Do your work always",
			"Do your best to train",
			"The journey is the reward"
	};
	
	@Override
	public String getBonus() {
		
		int index = myRandom.nextInt(data.length);
		String theBonus = data[index];
		
		return theBonus;
	}

}
