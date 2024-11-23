package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListLearn {
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();
		
		// add(String e) method 
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Elephant");
		animals.add("Cheetah");
		
		System.out.println("animal list: " + animals);
		
		// add(int index, String e)
		animals.add(2, "Hippo");
		
		System.out.println("after insertion: " + animals);
		
		List<String> domestic = new ArrayList<>();
		
		domestic.add("Dog");
		domestic.add("Cat");
		domestic.add("Cow");
		domestic.add("Horse");
		
		System.out.println("new domestic list: " + domestic);
		
		// addAll(Collection<? extends String> e)
		animals.addAll(domestic);
		
		System.out.println("after list addition: " + animals);
		
		// addAll(int index, Collection<? extends String> e)
		domestic.addAll(2, animals);
		
		System.out.println("after list insertion: " + domestic);
		
		// addFirst(String e)
		domestic.addFirst("Goat");
		System.out.println("after appending to first: " + domestic);
		
		// addLast(String e)
		domestic.addLast("Hen");
		System.out.println("after appending to last: " + domestic);
		
		// remove(int index)
		domestic.remove(0);
		System.out.println("after removing wiht index: " + domestic);
		
		// remove(String e)
		domestic.remove("Dog");
		System.out.println("after removing with value: " + domestic);
		
		System.out.println("does domestic contains Cow: " + domestic.contains("Cow")); 
		
		System.out.println("Iterating over list...");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		// get(int index)
		System.out.println("Value at index 7: " + animals.get(7));
		
		// set(int index, String e) returns the value previously at index
		System.out.println("Value replaced at 6: " + animals.set(6, "Rhinos"));
		
		// size()
		System.out.println("Size of the list: " + domestic.size());
		
		// converted to iterator and then iterate it with hasNext() and next()
		Iterator<String> iterator = domestic.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// ascending order using sort method
		domestic.sort((a, b) -> a.hashCode() - b.hashCode());
		System.out.println(domestic);
		
		// descending order using sort method
		animals.sort((a, b) -> b.hashCode() - a.hashCode());
		System.out.println(animals);
		
		// using Comparator.naturalOrder() to sort in ascending order
		animals.sort(Comparator.naturalOrder());
		System.out.println(animals);
		
		// clear()
		domestic.clear();
		
		// isEmpty() 
		System.out.println(domestic.isEmpty());
		
	}
}
