package com.ar.ali.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.ali.interfaces.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach", Coach.class);
		Coach thecoach2 = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (thecoach == thecoach2);
		
		System.out.println("Pointing to the same object: "+result);
		System.out.println("\nMemory location for theCoach: "+thecoach);
		System.out.println("\nMemory location for theCoach2: "+thecoach2);
	
		context.close(); 
	 
	}
	
}
