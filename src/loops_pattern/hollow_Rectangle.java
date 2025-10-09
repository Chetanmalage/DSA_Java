package loops_pattern;

import java.util.*;

public class hollow_Rectangle {
	public static void main(String [] arfs) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		int row= sc.nextInt();
		
		System.out.print("Enter coloumns: ");
		int column= sc.nextInt();
		
		for (int i = 1; i<= row; i++) {
			for(int j = 1; j<=column; j++) {
				if( i == 1 || j==1 || i==row || j==column ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
