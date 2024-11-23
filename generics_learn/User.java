package generics_learn;

public class User<T> {
	T name;
	User[] user = new User[4]; 
	
	public User(User u1, User u2, User u3, User u4 ) {
		this.user[0] = u1;
		this.user[1] = u2;
		this.user[2] = u3;
		this.user[3] = u4;
		
	}
	
	public static void main(String[] args) {
		
	}
}
