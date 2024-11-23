package collection.tasks;

import java.util.*;

public class QueueUsers<E> {
	
	void displayAll(Queue<User> queue) {
		for(User user: queue) {
			System.out.println("\t{\n" + "\t\t name: " + user.name + "\n" + "\t\t token id: " + user.token_id + "\n\t},\n");
		}
	}
	
	void display(User u) {
		System.out.println("{\n" + "\t name: " + u.name + "\n" + "\t token id: " + u.token_id + "\n}");
	}

	public static void main(String[] args) {

		Queue<User> users = new PriorityQueue<>();
		
		users.add(new User("Bala", 1));
		users.add(new User("Tharun", 2));
		users.add(new User("Raju", 3));
		users.add(new User("Lokesh", 4));
		users.add(new User("Agilan", 5));
		users.add(new User("Sarath", 6));
		
		QueueUsers<User> qu = new QueueUsers<User>();

		System.out.println("Queue of Users: \n");
		System.out.println("[");
		qu.displayAll(users);
		System.out.println("]");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println(
					"\nWelcome to users:\n\n Press 1 to show the first user \n " + "Press 2 to get in the first user \n "
							+ "Press 3 to add one user to the queue \n" + " Press 4 to show the size of the queue \n"
							+ " Press 5 to show the last added user \n " + "Press 6 to exit.\n");
			System.out.print("Enter your choice: ");
			int choice = scn.nextInt();

			switch (choice) {
			case 1:
				System.out.println("First User: \n");
				qu.display(users.peek());
				break;
			case 2:
				System.out.println(users.peek().name + " can get in");
				users.remove(users.peek());
				break;
			case 3:
				System.out.print("Enter the name: ");
				String name = scn.next();
				System.out.print("Enter token id: ");
				Integer token_id = scn.nextInt();
				users.add(new User(name, token_id));
				System.out.println("User " + name + " added!");
				break;
			case 4:
				System.out.println("The Size of the queue is: " + users.size());
				break;
			case 5:
				User[] arr = users.toArray(new User[0]);
				System.out.println("Lastly added User: \n ");
				qu.display(arr[arr.length - 1]);
				break;
			case 6:
				System.out.println("Thank you!");
				scn.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
