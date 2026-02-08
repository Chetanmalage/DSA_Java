package simple_program;

import java.util.*;

public class primeCheck {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number to Check it is prime or not: ");
		int num = sc.nextInt();
		
		int c = 2;
		
		if(num == 1) {
			System.out.println("Prime");
			return;
		}
		
		while(c*c <= num) {
			if(num % c == 0) {
				System.out.println(num+" is Not prime.");
				return;
			}
			c++;			
		}
		System.out.println(num+" is Prime number.");		
	}
}
