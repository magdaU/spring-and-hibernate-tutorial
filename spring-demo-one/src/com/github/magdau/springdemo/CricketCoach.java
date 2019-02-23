package com.github.magdau.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new field for emailAdress and team
	private String emailAdress;
	
	private String team;

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CrickerCoach: inside setter method -Email Adress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CrickerCoach: inside setter method -Team ");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("CrickerCoach: inside no- arg constructor");
	}
	
	//Our Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CrickerCoach: inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWarkout() {
		return "Practice fast bowling for 45 minutes every day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
