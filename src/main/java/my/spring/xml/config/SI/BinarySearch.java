package my.spring.xml.config.SI;

public class BinarySearch {
   private Sort sort;	
   public BinarySearch() {
	  System.out.println("Defaulty executed."); 
   }
   
   public void setSortService(Sort sort){
	   this.sort=sort;
   }
   
   public void start(){
	    System.out.println("Start search.");
   }
   
   public void search(int[] arr,int searchData){
	   //Do sort
	   sort.sort(arr);
	   //Search logic goes here
	   System.out.println("Search is processing...");
   }
   public void endMsg(){
	   System.out.println("Bianry Search is Done.");
   }
   
   public void end(){
	   System.out.println("Search ended.");
   }
}
