package my.spring.component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("binarySearchId")
public class BinarySearch {

//Autowired field injection.	
 // @Autowired
  private SortService sortService;
  
//Constructor injection 
  @Autowired
  public BinarySearch(@Qualifier("quickSortId")SortService sortService) {
       this.sortService=sortService;
  }
  
//  public BinarySearch() {
//  }
  
//  Setter injection
//  @Autowired
//  public void setSortService(SortService sortService){
//	  this.sortService=sortService;
//  }
  
  public void search(int[] A,int data){
	  //Do sorting
	  sortService.sort(A);
	  //Do searching
	  System.out.println("Searching is done.");
  }
  
	
}
