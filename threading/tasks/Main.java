package threading.tasks;

public class Main {
	public static void main(String[] args) {
		Counter count = new Counter();
		
		Runnable rn = () -> {
			for (int i = 0; i < 100; i ++) {
				count.increment();
				System.out.println(Thread.currentThread().getName() + ": " + Counter.counter);	
			}
		};
		
		Thread t1 = new Thread(rn);
		Thread t2 = new Thread(rn);
		Thread t3 = new Thread(rn);
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Final value of count: " + Counter.counter);
	}
}