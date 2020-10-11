package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationapplicationcontext.xml");
		Coach theCoach =  context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n pointing to the same object : " + result);
		System.out.println("\n memory location of thecoach : " + theCoach);
		System.out.println("\n memory locatio if alphaCoach :  " + alphaCoach);
		context.close();
	}

}
