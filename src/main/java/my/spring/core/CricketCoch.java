package my.spring.core;


//Constructor injection 

public class CricketCoch implements Coach{

	
	private FortuneService fortuneService;
	public CricketCoch(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("Do batting for 2 hours");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getGoodLuckFortune();
	}
	

}
