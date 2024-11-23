package collection;

import java.util.*;

public class LinkedHashSetLearn {
	public static void main(String[] args) {
		
		// Similar to Hash set does not allows redundancy
		// but maintain order
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for (int i = 0; i <= 10; i ++) {
			set.add(i);
		}
		System.out.println(set);
		
	}
}
