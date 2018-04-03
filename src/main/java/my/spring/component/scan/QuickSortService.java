package my.spring.component.scan;

import org.springframework.stereotype.Component;

@Component("quickSortId")
public class QuickSortService implements SortService {

	@Override
	public void sort(int[] A) {
		System.out.println("Quick Sort is done.");
	}

}
