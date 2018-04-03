package my.spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("binarySearchId")
public class BinarySearch {

	private Sort sort;
		
	@Autowired
	public BinarySearch(@Qualifier("mergeSortId")Sort sort) {
		this.sort=sort;
	}
	
	public void search(int[] Arr){
		//Do sorting
		sort.sort(Arr);
		//Search
		System.out.println("Search is done");
	}
	
}
