package collection.tasks;

public class User implements Comparable<User> {
	String name;
	Integer token_id;
	
	public User(String name, Integer token_id) {
		this.name = name;
		this.token_id = token_id;
	}

	@Override
	public int compareTo(User o) {
		return 0;
	}

}
