package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.BonusService;

public class PlayBonusService implements BonusService {

	@Override
	public String getBonus() {
		return "Today is your lucky day!";
	}

}
