package collection;

import java.util.*;

public class PriorityQueueLearn {
	public static void main(String[] args) {
		
		// queue allows redundancy
		// follows first in first out (FIFO)
		
		Queue<String> queue = new PriorityQueue<>();
		
		String[] names = {"Tharun", "Lokesh", "Raju", "Agilan", "Bala", "Sarath", "Bala"};
		
		for (String name: names) {
			queue.add(name);
		}
		
		// priority Queue always sort the elements within them
		
		System.out.println(queue);
		System.out.println(queue.peek()); // retrieves the first element
		System.out.println(queue.poll()); // retrieves and removes the first element 
		System.out.println(queue.remove()); // removes the first element
		System.out.println(queue);
		queue.forEach((item) -> System.out.println(item));
		queue.removeIf((item) -> item.startsWith("B"));
		System.out.println(queue);
	}
}
