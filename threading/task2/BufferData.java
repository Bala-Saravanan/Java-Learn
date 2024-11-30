package threading.task2;

import java.util.*;

public class BufferData {
	
	private LinkedList<Integer> queue = new LinkedList<>();
	private final static int MAX_CAPACITY = 5;
	Scanner scn = new Scanner(System.in);
	
	public synchronized void produce() throws InterruptedException {
		while(queue.size() == MAX_CAPACITY) {
			wait();
		}
		System.out.print("Enter a value to add to queue: ");
		int value = scn.nextInt();
		System.out.println("Produced: " + value);
		queue.add(value);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException {
		while (queue.size() == 0) {
			wait();
		}
		int value = queue.removeFirst();
		notify();
		System.out.println("Consumed: " + value);
	}
}
