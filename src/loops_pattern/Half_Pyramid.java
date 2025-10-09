package loops_pattern;

import java.util.*;

public class Half_Pyramid {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		int row = sc.nextInt();
		System.out.print("Enter column: ");
		int column= sc.nextInt();
	
		for(int i= 1; i<=row; i++) {
			for(int j= 1; j<=i ;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}