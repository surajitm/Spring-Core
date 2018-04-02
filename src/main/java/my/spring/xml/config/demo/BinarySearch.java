package my.spring.xml.config.demo;


public class BinarySearch {
   
	private Sortable sort;
	
	public BinarySearch(Sortable sort) {
		this.sort=sort;
	}
	
	public void search(int[] Arr,int data){
		//Do sorting
		sort.sort(Arr);
		//Do searching
		System.out.println("Searching is done.");
	}
	
}
