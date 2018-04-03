package my.spring.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContext {
   public static void main(String[] args) {
	  //Create spring container.
	  ApplicationContext context=new ClassPathXmlApplicationContext("bean-context.xml");
	  
	  //Launch spring container to get the beans
	  BinarySearch search=context.getBean("binarySearchId",BinarySearch.class);
	  
	  //Use the bean to execute method.
	  search.search(new int[]{14,10,12,4,50},10);
	  
	  //close the spring container.
	  ((ClassPathXmlApplicationContext)context).close();
	  
	 
}
}
