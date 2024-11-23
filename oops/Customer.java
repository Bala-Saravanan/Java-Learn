package oops;

public class Customer extends Bank {
	// private attributes
	private int customerId;
	private String customerName;
	private boolean isNetBanking = false; 
	private boolean isAtmCard = false;
	
	// getters setters to access private attributes
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

	
	public void requestAtmCard(boolean isAtmCard) {
		if (isAtmCard) {
			this.isAtmCard = isAtmCard;
		}
		if (this.isAtmCard) {
			System.out.println("You can proceed through ATM Card!");
		} else {
			System.out.println("Atm Card: " + this.isAtmCard + "\nSorry! Request ATM Card failed!");
		}
		
	}
	
	public void isNetBankingAvailable(String name, int id) {
		if (this.customerName == name && this.customerId == id) {
			this.isNetBanking = true;
		}
		if (this.isNetBanking ) {
			
			System.out.println("Customer Name: " + this.customerName + "\nCustomer Id: " +this.customerId + "\nYou Can proceed through Net Banking!");
		} else {
			System.out.println("Sorry! The declared customer name or id did not match the actual customer!");
		}
		
	}
	
	public void blockAccount(boolean block) {
		if(block) {
			System.out.println("Account Number Blocked!");
		} 
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerName("Bala");
		c1.setCustomerId(123456789);
		c1.setIfscCode(123);
		c1.setAccountNumber(5763489);
		c1.setBankName("State Bank of India");
		c1.setBranchName("Puducherry");
		c1.setManagerName("Arun");
		c1.givePermission("Arun");
		c1.requestAtmCard(false);
		c1.isNetBankingAvailable("Bala", 123456789);
		c1.blockAccount(true);
	}
}


