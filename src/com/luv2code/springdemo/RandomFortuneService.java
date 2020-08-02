package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data={
		"Don't go without a mask",
		"Don't run in the sun",
		"Be honest because Honesty is the best policy"
	};
	
	Random myRandom = new Random();
	
	int index = myRandom.nextInt(data.length);
	
	String myfortune = data[index];

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return myfortune;
	}

}
