package fileHandling;

import java.io.*;

class Student implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	private String password;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password; 
	}
}

public class Serialization {
	public static void main(String[] args) {
		String parent = "D:\\Java_tasks";
		String child = "test.ser";
		File file = new File(parent, child);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student s1 = new Student("Bala", 17);
			s1.setPassword("jbala007");
			oos.writeObject(s1);
			System.out.println("File Serialized successfully!");
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
