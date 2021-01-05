package com.ar.ali.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		CaptainCoach theCaptain = context.getBean("myCaptainCoach", CaptainCoach.class);
		
		// Call methods on the bean
		System.out.println(theCaptain.getDailyWorkout());
		System.out.println(theCaptain.getDailyBonus());
		
		// Close the context
		context.close(); 
	}

}
