package studentMarksList;

import java.util.*;
public class Student<e> {
	
	public int calculateTotal(ArrayList<Integer> marks) {
		int total = 0; 
		for(int mark : marks) {
			total += mark;
		}
		return total;
	}
	public float calculateAvg(int total, int n) {
		float avg = total / n;
		return avg;
	}
	public boolean calculateResult(ArrayList<Integer> marks) {
		boolean isPassed = true;
		for(int mark: marks) {
			if (mark < 40) {
				isPassed = false;
			}
		}
		return isPassed;
	}
	public char calculateGrade(float avg) {
		char grade;
		if (avg > 90) {
			grade = 'A';
		} else if (avg > 80 && avg < 90) {
			grade = 'B';
		} else if (avg > 70 && avg < 80) {
			grade = 'C';
		} else if (avg > 60 && avg < 70) {
			grade = 'D';
		} else if (avg > 50 && avg < 60) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		return grade;
	}
	public static void main(String[] args) {		
		System.out.println("\t\t\tSTUDENT MARK LISTS");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of Subjects: ");
		int n = scn.nextInt();
		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 0; i < n; i ++) {
			System.out.print("Enter the marks for subject " + (i+1) + ": ");
			int mark = scn.nextInt();
			marks.add(mark);
		}
		Student<Integer> student1 = new Student<>(); 
		int total = student1.calculateTotal(marks);
		System.out.println("Total: " + total);
		float avg = student1.calculateAvg(total, n);
		System.out.println("Average: " + avg);
		boolean isPassed = student1.calculateResult(marks);
		String result = (isPassed) ? "Pass" : "Fail"; 
		System.out.println("Result: " + result);
		char grade = student1.calculateGrade(avg);
		System.out.println("Grade: " + grade);
		scn.close();
	}
}
