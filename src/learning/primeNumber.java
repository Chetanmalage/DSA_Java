package learning;

import java.util.*;

public class primeNumber {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number which you want check if it is prime or not");
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		boolean prime = true;
	
		if (number <= 1) {
			System.out.println(number +" is not prime number.");
		}else if(number == 2) {
			System.out.println(number +" is prime number.");
		}else {
			for(int i=2; i<=number-1;i++) {
				if(number % i == 0) {
					prime=false;
					break;
				}
			}
			if(prime == true ) {
				System.out.println(number +" is prime number.");
			}else {
				System.out.println(number +" is not prime number.");
			}
		}
		sc.close();
	}
}