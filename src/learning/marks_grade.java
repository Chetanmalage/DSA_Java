package learning;

import java.util.*;

public class marks_grade {
	public static void main(String []atgg) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("Enter 1 for entering marks of students.");
		System.out.println("Enter 0 for stop getting marks of students.");
		
		int marks;
		do {
			System.out.print("enter a number(0 or 1): ");
     		number= sc.nextInt();
     		if(number<0 || number >1) {
     			System.out.println("Enter a valid number (0 or 1): ");
     			number= sc.nextInt();
     			if(number==0) {
     				break;
     			}else {
     				continue;
     			}
     		}else if(number == 0) {
     			break;
     		}
			System.out.print("Enter marks of students out of 100: ");
			marks= sc.nextInt();
			
			if(marks > 100) {
				System.out.print("Enter valid marks of students in between (0 to 100): ");
				marks= sc.nextInt();
				
				if(marks <100) {
					if(marks >= 90 && marks <= 100) {
						System.out.println("This is Good!");
					} else if(marks <= 89 && marks >=60 ) {
						System.out.println("This is also Good!");
					} else if(marks<=59 && marks >=0) {
						System.out.println("This is Good as well!");								
					}
				}
				
			} else if(marks >= 90 && marks <= 100) {
				System.out.println("This is Good!");
			} else if(marks <= 89 && marks >=60 ) {
				System.out.println("This is also Good!");
			} else if(marks<=59 && marks >=0) {
				System.out.println("This is Good as well!");								
			}
		}while(number!=0);
		
		System.out.println("Thank you!");
		sc.close();
	}
}
