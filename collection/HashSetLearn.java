package collection;

import java.util.*;

public class HashSetLearn {
	public static void main(String[] args) {
		
		// Set does not allows redundancy and does not maintain order
		
		// Set Creation
		Set<String> set = new HashSet<>();
		
		// Adding Items
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");  // does not allow duplicates
		
		System.out.println(set);
		
		// membership 
		boolean isApple = set.contains("Apple");
		System.out.println("Contains Apple: " + isApple);
		
		// length
		System.out.println("Size: " + set.size() + " Elements");
		
		// Removing an item
		set.remove("Apple");
		
		// membership after removing
		System.out.println("Contains Apple: " + set.contains("Apple"));
		
		// Iterating over set elements
		for(String fruit: set) {
			System.out.println(fruit);
		}
		
		// Iterator
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Spliterator
		Spliterator<String> spliterator1 = set.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		System.out.println("1st Split");
		spliterator1.forEachRemaining(System.out::println);
		System.out.println("2nd Split");
		spliterator2.forEachRemaining(System.out::println);
		
		// clear()
		set.clear();
		
		// isEmpty()
		System.out.println("Set is Empty: " + set.isEmpty());		
	}
}
