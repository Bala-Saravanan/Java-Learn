package threading.task3;

public class BankManagement {
	
	static int total_amt = 0; 
	static int MAX_CAPCITY = 100000;
	
	BankManagement(int amount) {
		total_amt = amount;
	}
	
	public synchronized void deposit(int amount) throws InterruptedException {
		 while (total_amt >= MAX_CAPCITY) {
			 wait();
		 }
		 total_amt += amount;
		 System.out.println("Deposited amount: " + amount);
		 notify();
	}
	
	public synchronized void withdraw(int amount) throws InterruptedException {
		while (total_amt < amount) {
			wait();
		}
		total_amt -= amount;
		System.out.println("Withdrawn amount: " + amount);
		notify();
	}
	 
}
