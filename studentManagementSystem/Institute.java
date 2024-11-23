package studentManagementSystem;

import java.util.Scanner;

public class Institute {
	String name, location, head, landmark;
	long phoneNo, mobileNo;

	public Institute(String name, String location, String head, String landmark, long phoneNo, long mobileNo) {
		this.name = name;
		this.location = location;
		this.head = head;
		this.landmark = landmark;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
	}

	public String callInstitute(String number) {
		return number.equals("Phone") ? "Calling" + this.phoneNo : "Calling" + this.mobileNo;
	}

	public String isTodayInstitute(String day) {
		return day.equals("Sunday") ? "No, The Institution is closed!" : "Yes, The Institution is open!";
	}

	public String chechInstituteTiming() {
		return "9:00 a.m to 5:00 p.m";
	}

	public String makeEnquiry() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Which Course do you want? ");
		String course = scn.next();
		scn.close();
		if (course.equals("Python")) {
			return "Python is a versatile, high-level programming language known for its simplicity and readability. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. Python's vast standard library and numerous third-party modules make it ideal for a wide range of tasks, from web development and data analysis to artificial intelligence and automation. It is an interpreted language, which allows for rapid development and testing. Its active community and extensive documentation make it accessible to both beginners and experienced developers.";
		} else if (course.equals("Java" )) {
			return "Java is a versatile, high-level, object-oriented programming language designed to be platform-independent, following the principle of \"write once, run anywhere.\" It is widely used for building enterprise-level applications, mobile apps (especially Android), and large-scale systems. Java offers strong memory management, security features, and supports multi-threading, making it suitable for high-performance applications. Its extensive libraries and frameworks, such as Spring and Hibernate, provide robust tools for developers. Java's long-standing community and consistent updates ensure its relevance in modern software development.";
		} else {
			return "Full-stack development refers to the practice of working on both the frontend and backend of a web application, covering the entire technology stack. A full-stack developer is proficient in frontend technologies like HTML, CSS, and JavaScript, as well as backend technologies such as Node.js, Python, or Java, and databases like MongoDB or MySQL. They are capable of building a complete web application, from designing the user interface to implementing business logic and managing data storage. Full-stack developers often handle deployment and server management, making them versatile and valuable in web development projects. The role requires continuous learning to keep up with evolving technologies and frameworks.";
		}
		
	}
}
