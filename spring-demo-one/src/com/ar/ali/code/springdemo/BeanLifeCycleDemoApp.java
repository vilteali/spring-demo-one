package com.ar.ali.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.ali.interfaces.springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
	
		context.close(); 
	 
	}
	
}
