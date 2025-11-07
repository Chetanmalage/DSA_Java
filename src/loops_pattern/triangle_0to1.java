package loops_pattern;

import java.util.*;

public class triangle_0to1 {
	public static void main(String [] args) {
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Rows: ");
		int row= as.nextInt();
		
		for(int i=1; i<=row;i++) {
			for(int j=1; j<=i;j++) {
				if(j%2 == 0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}
