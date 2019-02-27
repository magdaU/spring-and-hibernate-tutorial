package com.github.magdau.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
		
	//properties from sport.sporties file
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 100 metres as a wam up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//add to get from file properties
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
}
