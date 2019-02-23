package com.github.magdau.springdemo;

public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TenisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWarkout() {
		return "Practice your putting skills for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
