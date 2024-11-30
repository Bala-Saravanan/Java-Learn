package threading.task3;

public class Main {
	
	public static void main(String[] args) {
		
		BankManagement bm = new BankManagement(100000);

		Thread deposit = new Thread(() -> {
			while (true) {
				try {
					int amt = (int) (Math.random() * 100);
					bm.deposit(amt);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	
		Thread withdraw = new Thread(() -> {
			while (true) {
				try {
					int amt = (int) (Math.random() * 100);
					Thread.sleep(500);
					bm.withdraw(amt);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}	
			}
		});
		
		deposit.start();
		withdraw.start();
	}
}
