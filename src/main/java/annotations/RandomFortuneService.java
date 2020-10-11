package annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String [] data = {
			"Today is a average day" , "Today is not a good day" , 
			"Today is a awesome day"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
