package my.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Create spring container
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	//Retrieve beans from container
    	Coach coach=context.getBean("mycoach",Coach.class);
    	//Use the bean to call method
    	coach.getDailyWorkout();
    	//close the container
    	context.close();
    	
    }
}
