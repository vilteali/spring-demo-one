package com.ar.ali.code.springdemo;

import com.ar.ali.interfaces.springdemo.Coach;

public class MyApp {

	public static void main(String[] args) {
		
		// Instanciamos el objeto
		Coach theCoach = new BaseballCoach(null);
		Coach theCoach2 = new TrackCoach(null);
		
		// Usamos el objeto
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
	}

}
