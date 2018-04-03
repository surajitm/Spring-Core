package my.spring.component.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressId")
public class Address {
	@Value("${employee.city}")
    private String city;
	
	@Value("${employee.state}")
    private String state;
    
	//Bean is created using default constructor
	//Do not delete that.
	public Address() {
	}
	
    public Address(String city,String state) {
    	this.city=city;
    	this.state=state;
	}
    public String getCity(){
    	return city;
    }
    
    public String getState(){
    	return state;
    }
    
}
