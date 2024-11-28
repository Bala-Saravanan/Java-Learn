package threading.synchronization;

public class Thread_Synchronization {
	
	int count = 0;
	
	public synchronized void increment() {
		count ++;
	}
}
