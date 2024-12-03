package map.tasks;

import java.util.*;

public class CountWords {
	public static void main(String[] args) {
		Map<String, Integer> counter = new HashMap<>();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String[] text = scn.nextLine().split("\\s+");
		scn.close();

		for (int i = 0; i < text.length; i ++) {
			if(!counter.containsKey(text[i])) {
				int count = 0;
				for (int j = i; j < text.length; j ++) {
					if (text[i].equals(text[j])) {
						count += 1;
					}
				}	
				counter.put(text[i], count);
			}
		}
		System.out.println("Counter: " + counter);
		
	}
}
