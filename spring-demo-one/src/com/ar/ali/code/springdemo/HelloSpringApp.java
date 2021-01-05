package com.ar.ali.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.ali.interfaces.springdemo.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Let's call our new method for BonusService
		System.out.println(theCoach.getDailyBonus());
		
		// Close the context
		context.close();
		
	}

}
