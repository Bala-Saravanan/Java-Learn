package fileHandling;

import java.io.*;
import java.util.Scanner;

public class CreateFile {

	
	public void createFile(String file, int count) {
		File file1 = new File(file);
		try {
			Scanner scn = new Scanner(System.in);
			FileWriter fw = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Ocean Academy Java 7-8 Batch Student Names\n\n");
			System.out.println("Please Enter Java Batch Student Names");
			for (int i = 0; i < count; i ++) {
				System.out.print("Student "+ (i+1) +" name: ");
				String name = scn.next();
				bw.write((i+1)+ ". " + name+"\n");
			}
			bw.close();
			scn.close();
			System.out.println("File Successfully Created!");
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		
	}
	
	public static void main(String[] args) {
		
		CreateFile cf = new CreateFile();
		String file = "D:\\\\Java_tasks\\OA_7_8.txt";
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int count = scn.nextInt();
		scn.close();
		cf.createFile(file, count); 
		
	}
}
