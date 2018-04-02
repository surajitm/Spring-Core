package my.spring.xml.config.CI;

public class BinarySearch {

	private Sort sort;
	private int searchValue;
	
	public BinarySearch(Sort sort,int searchValue) {
		this.sort=sort;
		this.searchValue=searchValue;
	}
	
	public void search(int[] Arr){
		//Do sorting
		sort.sort(Arr);
		//Search
		System.out.println(searchValue+" is found.");
		System.out.println("Search is done");
	}
	
}
