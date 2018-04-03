package my.spring.xml.config.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
     public static void main(String[] args) {
		//Create Application Context
    	 ApplicationContext context=new ClassPathXmlApplicationContext("beans-si.xml");
    	 //Retrieve bean
    	 BinarySearch search1=context.getBean("binarySearchId",BinarySearch.class);
    	 BinarySearch search2=context.getBean("binarySearchId",BinarySearch.class);
    	 //Use bean to execute methods()
    	 search1.search(new int[]{1,4,10,8,0},8);
    	 search1.endMsg();
    	 
    	 //Checking scope
    	 if(search1==search2){
    		 System.out.println("Singleton : "+search1+" and "+search2);
    	 }else{
    		 System.out.println("Prototype : "+search1+" and "+search2);
    		 
    	 }
    	 //close the bean
    	 ((ClassPathXmlApplicationContext)context).close();
	}
}
