package my.spring.core;

public class FootballCoach implements Coach{

	@Override
	public void getDailyWorkout() {
		System.out.println("Play football for three hours");
	}

}
