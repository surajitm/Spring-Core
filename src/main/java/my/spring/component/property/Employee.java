package my.spring.component.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empId")
//@Scope("prototype")
//By Default socpe is singleton
public class Employee implements Person {

	@Autowired
	private Address address;
	
	private String name;
	private String sal;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	@Override
	public void doSomeWork() {
		System.out.println("Doing Employer work.");
	}
	
	@Override
	public String toString(){
		return String.format("Name:%s , Salary:%s ,City:%s,State:%s", name,sal,address.getCity(),address.getState());
	}

}
