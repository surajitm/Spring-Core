package my.spring.java.config.bean;


public class QuickSort implements Sort {

	@Override
	public void sort(int[] A) {
		System.out.println("Quick sort is done.");
	}

}
