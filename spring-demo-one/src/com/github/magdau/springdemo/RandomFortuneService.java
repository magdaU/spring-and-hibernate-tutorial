package com.github.magdau.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	//Create an array of strings
	private String[]lotery = {
			"Today you win a car",
			"Today you win a book",
			"Today you win a voucher 100 euro",
			"Today you win a bike"
	};
	
	//Create a random number generator
	private Random randomNumber = new Random();
	
	@Override
	public String getFortune() {
	//Pick a random string from the array
		int indexOfArray=randomNumber.nextInt(lotery.length);
			String theFortune = lotery[indexOfArray];
			return theFortune;
	}
}
