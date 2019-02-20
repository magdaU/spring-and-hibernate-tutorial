package com.github.magdau.springdemo;

public class BaseballCoach implements Coach{
	
	//Define a private filed for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWarkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//Use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
