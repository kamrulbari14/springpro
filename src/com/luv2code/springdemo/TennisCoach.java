package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>inside default constructor");
	}
	
	/*@Autowired
	public TennisCoach(FortuneService theFotuneService) {
		fortuneService = theFotuneService;
	}*/
	
	/*@Autowired
	public void DoAnything(FortuneService theFortuneService) {
		System.out.println(">>inside Setter method");
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
