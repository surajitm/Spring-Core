package my.spring.component.scan;

import org.springframework.stereotype.Component;

@Component("mergeSortId")
public class MergeSort implements SortService {

	@Override
	public void sort(int[] A) {
		System.out.println("MergeSort is done.");
	}

}
