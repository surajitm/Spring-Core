package my.spring.component.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 //Create Application context
	ApplicationContext context=new ClassPathXmlApplicationContext("bean-property.xml");
	
	//Retrieve bean
	Employee emp=context.getBean("empId",Employee.class);
	emp.setName("Surajit");
	emp.setSal("600000");
	System.out.println(emp);
	
	//Check for the scope
	Employee emp1=context.getBean("empId",Employee.class);
	System.out.println(emp==emp1);
	
	//close context
	((ClassPathXmlApplicationContext)(context)).close();
}
}
