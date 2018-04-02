package my.spring.xml.config.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String... args){ 
	//create application context
	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	 
	//retrieve the bean
	 BinarySearch search=context.getBean("binarySearchID", BinarySearch.class);
	 
	//use the bean execute methods
	 int arr[]={3,8,10,5,1};
	 
	 search.search(arr,5);
	// close the bean.
	context.close(); 
	}
}
