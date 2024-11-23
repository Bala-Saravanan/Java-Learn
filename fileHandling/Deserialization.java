package fileHandling;

import java.io.*;

public class Deserialization {

	
	public static void main(String[] args) {
		String parent = "D:\\Java_tasks";
		String child = "test.ser";
		File file = new File(parent,child);
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student obj = (Student) ois.readObject();
			System.out.println(" age is "+obj.age+" name is "+obj.name+" password is "+obj.getPassword());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
