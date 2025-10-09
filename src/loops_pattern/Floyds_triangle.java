package loops_pattern;

import java.util.*;

public class Floyds_triangle {

	public static void main(String []args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter a Rows: ");
		int Rows = a.nextInt();
		
		int number =1;
		for(int i = 1; i<=Rows;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
	}
}
