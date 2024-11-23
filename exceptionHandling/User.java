package exceptionHandling;

public class User {
	
	// Setting private non-static variables
	private String userName, password, dateOfBirth;
	private int age;
	
	// Constructor for assigning values to non-static variables
	public User(String uname, int age, String DOB) {
		this.userName = uname;
		this.age = age;
		this.dateOfBirth = DOB;
	}

	// Getters to access private variables
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDOB() {
		return dateOfBirth;
	} 

	// Setter for password 
	public void setPassword(String password) throws UserPasswordOutOfBoundsException {
		
		// condition to set password of length 8 characters
		if (password.length() >= 8) {
			
			// if not throw user defined exception
			throw new UserPasswordOutOfBoundsException("Password must be less than 8 characters!");
			
		} else {
			
			this.password = password;	
			
		}	
	}
	
	//method to login the user
	public void login(String pword) throws UserPasswordInvalidException {
		
		// condition to check the password is correct
		if (pword.equals(this.password)) {
			
			System.out.println("Login Successful!");
			
		} else {
			
			// if not throw user defined exception
			throw new UserPasswordInvalidException("Password missmatch!");
		}
	}
	
	// main method starts here
	public static void main(String[] args) {
		
		// Object creation
		User u1 = new User("Bala", 17, "6/4/2007");
		
		// handle password more than 8 characters error
		try {
			u1.setPassword("abcd123");
		} 
		catch (UserPasswordOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// prints the user details to the console
		System.out.println("UserName: " + u1.getUserName());
		System.out.println("Age: " + u1.getAge());
		System.out.println("Date of Birth: " + u1.getDOB());
		
		// handle password mismatch error
		try {
			u1.login("abcd123");
		} 
		catch (UserPasswordInvalidException e) {
			System.out.println(e);
		}
	}
}
