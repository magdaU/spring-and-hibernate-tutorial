package com.github.magdau.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NewFortuneService implements FortuneService {
	
	
	private String[] dataNewLottery = { 
			"NewLoterry: you win a voucher 200zl",
			"NewLottery: you win a joga course",
			"NewLottery: you win a two-weeks jorney to Craotia"
	};
	
	private Random myNumberRandom = new Random();

	@Override
	public String getFortune() {
        // method would return a random fortune from the array
		int index = myNumberRandom.nextInt(dataNewLottery.length);
		String theNewFortuneLottery = dataNewLottery[index];
		return theNewFortuneLottery;
	}
}
