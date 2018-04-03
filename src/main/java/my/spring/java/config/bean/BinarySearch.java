package my.spring.java.config.bean;

//import org.springframework.stereotype.Component;

//@Component("binarySearchId")
public class BinarySearch {

	private Sort sort;
	
	public BinarySearch(Sort sort) {
		this.sort=sort;
	}
	
	public void search(int[] Arr){
		//Do sorting
		sort.sort(Arr);
		//Search
		System.out.println("Search is done");
	}
}
