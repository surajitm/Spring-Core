package my.spring.core;

public class FootballCoach implements Coach{

	@Override
	public void getDailyWorkout() {
		System.out.println("Play football for three hours");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
