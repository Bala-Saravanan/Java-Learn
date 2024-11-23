package collection;

import java.util.*;

public class LInkedLIstLearn {

	// Similar to arrayList but stores the data in nodes
	// meaning the pointer in every element is pointed to
	// next element, so that insertion and deletion is easy.
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		for (int i = 0; i <= 100; i++) {
			list.add(i); 
		}
		
		System.out.println(list);
		
		list.add(5, 3);
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		// with linked list these operations are faster
		
	}
}
