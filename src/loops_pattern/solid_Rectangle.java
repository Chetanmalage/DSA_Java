package loops_pattern;

import java.util.*;

public class solid_Rectangle {

	public static void main(String arsd[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many rows you want: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter how many columns you want: ");
		int columns = sc.nextInt();
		
		for(int i=1; i <=rows; i++ ) {
			for(int j=1; j<= columns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
