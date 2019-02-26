package com.github.magdau.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String []  loteryData = {
			"You win a bicycle today",
			"You win a motorbike today ",
			"You win a scotter today"		
	};
	
	//Create a random number
	private Random numberRandomLottery = new Random();
	
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = numberRandomLottery.nextInt(loteryData.length);
		String theFortuneToday = loteryData[index];
		return theFortuneToday;
	}
}
