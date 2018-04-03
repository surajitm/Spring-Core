package my.spring.java.config;

import org.springframework.stereotype.Component;

@Component("quickSortId")
public class QuickSort implements Sort {

	@Override
	public void sort(int[] A) {
		System.out.println("Quick sort is done.");
	}

}
