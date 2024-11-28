package threading;

public class Thread_Runnable implements Runnable {
	int threadNumber;
	
	Thread_Runnable(int t_no) {
		this.threadNumber = t_no;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i ++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " from thread " + this.threadNumber);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Thread_Runnable thread_1 = new  Thread_Runnable(1);
		Thread_Runnable thread_2 = new  Thread_Runnable(2);
		Thread_Runnable thread_3 = new  Thread_Runnable(3);

		Thread t1 = new Thread(thread_1);
		Thread t2 = new Thread(thread_2);
		Thread t3 = new Thread(thread_3);
		
		// Prioritizing threads
		
		// the priority range is from 1 to 10
		
		// 1 - least priority
		// 5 - normal priority
		// 10 - highest priority
		
		// by setting the priority to a thread 
		// we can suggest the compiler to give
		// the thread a higher or lower priority.
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
