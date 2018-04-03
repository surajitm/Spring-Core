package my.spring.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
   public static void main(String[] args) {
	//Create Application Context
	  // ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-ci.xml");
	  AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AlgoConfig.class);
	   
	//Retrieve the bean
	 BinarySearch search=context.getBean("binarySearchId",BinarySearch.class);  
	//use bean to execute method
	 search.search(new int[]{5,8,0,2,1,5});
	//close the Application Context
	  context.close();
}
}
