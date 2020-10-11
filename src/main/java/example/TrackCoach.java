package example;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it : " + fortuneService.getFortune();
	}
	//init method
	public void doMyStartupstuff() {
		System.out.println("TrackCoach : inside startup method");
	}
	
	//destroy method
	public void doMyCleanupstuff() {
		System.out.println("TrackCoach : inside cleanup method");
	}

}
