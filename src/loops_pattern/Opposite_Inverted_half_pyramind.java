package loops_pattern;

import java.util.*;

public class Opposite_Inverted_half_pyramind {
	public static void main(String []arfs) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		
//		int space = 0;
//		space = space + number;
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<= number-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}