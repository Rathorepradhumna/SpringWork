package example;

public class CricketCoach implements Coach {
	private String team;
	private String email;
	
	
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Circket coach : inside setter setTeam");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Circket coach : inside setter setEmail");
		this.email = email;
	}

	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Circket coach : inside no arugment constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Circket coach : inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
