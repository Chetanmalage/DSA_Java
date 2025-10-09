package learning;

import java.util.*;

public class EvenNumberTillnN {
	public static void main(String adde[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
	
		System.out.print("Even numbers are:" );
		for(int i= 1; i <=number; i++) {
			if(i%2 == 0) {
//				System.out.print("Even numbers are:" );
				System.out.print(i+" ");
			}
		}
	}
}
