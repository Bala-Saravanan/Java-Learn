package oops;

public abstract class Bank {
	// private Attributes
	private String bankName;		
	private int ifscCode;		 
	private String branchName;	
	private String managerName;
	
	
	// Getters and Setters to access private variables
	public void setAccountNumber(int ifsc) {
		this.ifscCode = ifsc;
	}
	
	public int getAccountNumber() {
		return this.ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName  = managerName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName ) {
		this.branchName = branchName;
	}
	
	//Concrete Method
	public void givePermission(String managerName) {
		if (this.managerName == managerName) {
			System.out.println("Manager name: " + this.managerName + "\nPermission Accepted!");
		} else {
			System.out.println("Permission Denied!");
		}
	}
	
	// Abstract method
	public abstract void requestAtmCard(boolean isAtmCard);
}


