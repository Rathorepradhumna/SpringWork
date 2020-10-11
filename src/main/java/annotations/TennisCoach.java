package annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		super();
		System.out.println("default constructor of TennisCoach");
	}
	//do my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Tennis coach startup method");
	}
	
	//destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("tennis coach destroy method");
	}
	
/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach setter method");
		this.fortuneService = fortuneService;
	}
*/

	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
*/	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
