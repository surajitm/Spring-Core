package my.spring.java.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("my.spring.java.config.bean")
public class Config {

	/* REMEMBER:
	 * Method name is going to be the bean id.
	 */
	
	@Bean
	public Sort mergeSort(){
		return new MergeSort();
	}
	
	@Bean
	public Sort quickSortId(){
		return new QuickSort();
	}
	
	@Bean
	public BinarySearch binarySearchId(){
		return new BinarySearch(quickSortId());
	}
}
