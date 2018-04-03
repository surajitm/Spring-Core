package my.spring.java.config.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
   public static void main(String[] args) {
	//Create Application Context
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	   
	//Retrieve the bean
	 BinarySearch search=context.getBean("binarySearchId",BinarySearch.class);  
	//use bean to execute method
	 search.search(new int[]{5,8,0,2,1,5});
	//close the Application Context
	  context.close();
}
}
