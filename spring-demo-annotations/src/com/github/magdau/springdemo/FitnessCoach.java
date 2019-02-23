package com.github.magdau.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise you dynamic and speed on jumping";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
