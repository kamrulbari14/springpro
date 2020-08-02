package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
	public static void main(String[]args) {
	
	ClassPathXmlApplicationContext Context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach theCoach = Context.getBean("tennisCoach", Coach.class);
	Coach alphaCoach = Context.getBean("tennisCoach", Coach.class);
	
	boolean result = (theCoach==alphaCoach);
	System.out.println(result);
	System.out.println("The value of theCoach"+theCoach);
	System.out.println("The value of theCoach"+alphaCoach);
	
	Context.close();
	
	}
}
