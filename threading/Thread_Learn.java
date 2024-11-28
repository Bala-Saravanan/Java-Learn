package threading;


/*
 * Three ways of using threads in our program
 * 
 *  1) By extending Thread
 *  2) By implementing Runnable
 *  3) By Using Anonymous class
 */

public class Thread_Learn extends Thread {
	String fname, lname;
	
	Thread_Learn(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public void printFirstName() {
		for (int i = 1; i <= 100; i ++) {
			System.out.println(i + ") " + this.fname);
		}
	}
	
	public void printLastName() {
		for (int i = 1; i <= 100; i ++) {
			System.out.println(i + ") " + this.lname);
		}
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			for (int i = 1; i <= 100; i ++) {
				System.out.println(i + ") " + this.lname);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		Thread_Learn tl = new Thread_Learn("Bala", "Saravanan");
		tl.start();
		tl.printFirstName();
	}
}
