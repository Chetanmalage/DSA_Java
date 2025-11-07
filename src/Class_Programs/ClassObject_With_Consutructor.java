package Class_Programs;

import java.util.*;

public class ClassObject_With_Consutructor {
	
	static int dob;
	int rollNumber;
	String name;
	String college;
	
	public ClassObject_With_Consutructor(int rollNumber, String name, String college) {
		this.rollNumber= rollNumber;
		this.name= name;
		this.college= college;
		
		System.out.println("My name is "+ name+ ".");
		System.out.println("My roll number is "+rollNumber+".");
		System.out.println("My college name is "+ college+".");
	}
	
	public static void myInfo() {
		dob= 21;
		System.out.println("My date of birth is "+ dob);		
	}
	
	public static void main(String [] arhs) {	
		Scanner as = new Scanner(System.in);
	
		long phoneNumber;
		
		System.out.println("Hello everyone!");
		
		ClassObject_With_Consutructor ass = new ClassObject_With_Consutructor(01, "Chetan Malage", "VVP Institute of Enginerring and Technology, Solapur");	
		
		System.out.print("Enter your phone number: ");
		phoneNumber = as.nextLong();
		
		myInfo();
		
		System.out.println("Thank you!");
		as.close();
		
	}
}
