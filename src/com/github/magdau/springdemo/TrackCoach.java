package com.github.magdau.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	private FortuneService fortuneService;
	

	@Override
	public String getDailyWarkout() {
		return "Run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}
}
