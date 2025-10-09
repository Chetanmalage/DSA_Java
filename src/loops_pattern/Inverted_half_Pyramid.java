package loops_pattern;

import java.util.*;

public class Inverted_half_Pyramid {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int row = sc.nextInt();
//		System.out.print("Enter column: ");
//		int column = sc.nextInt();
		
		for(int i = 1; i<=row; i++ ) {
			for(int j= row ; j >=i ;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
