package com.github.magdau.springdemo;

public class RunnerCoach implements Coach {
	
	@Override
	public String getDailyWarkout() {
		return "Practice your putting skills runner every day  for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}
