package threading.tasks;

public class Counter {
	static int counter = 0; 
	
	public synchronized void increment() {
		counter ++;
	}
}


