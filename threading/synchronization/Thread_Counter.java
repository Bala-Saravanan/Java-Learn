package threading.synchronization;

public class Thread_Counter implements Runnable {
	
	Thread_Synchronization ts;
	
	Thread_Counter(Thread_Synchronization ts) {
		this.ts = ts;
	}
	
	@Override 
	public void run() {
		for (int i = 0; i < 1000; i ++) {
			ts.increment();
		}
	}
}
