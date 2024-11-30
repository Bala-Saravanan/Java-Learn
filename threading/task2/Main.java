package threading.task2;

public class Main {
	public static void main(String[] args) {
		BufferData bd = new BufferData();
		
		
		Thread producer = new Thread(() -> {
			while (true) {
				try {
					bd.produce();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		
		
		Thread customer = new Thread(() -> {
			while (true) {
				try {
					bd.consume();
				} catch (InterruptedException e2) {
					Thread.currentThread().interrupt();
				}
			}
		});
		
		producer.start();
		customer.start();
	}
}
