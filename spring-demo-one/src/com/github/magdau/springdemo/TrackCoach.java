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
	
	//Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
