package my.spring.java.config;

import org.springframework.stereotype.Component;

@Component("mergeSortId")
public class MergeSort implements Sort {

	@Override
	public void sort(int[] A) {
		System.out.println("MergeSort Is done.");
	}

}
