package threading.synchronization;

public class Main {
	
	public static void main(String[] args) {
		Thread_Synchronization ts = new Thread_Synchronization();
		
		Thread thread_1 = new Thread(new Thread_Counter(ts));
		Thread thread_2 = new Thread(new Thread_Counter(ts));
		
		thread_1.start();
		thread_2.start();
		
		try {
			thread_1.join();
			thread_2.join();
		} catch (Exception e) { e.printStackTrace();}
		
		System.out.println(ts.count);
	}
}
