package loops_pattern;

import java.util.*;

public class Inverted_half_pyramid_with_number {
	public static void main(String name[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1;j<=number-i+1 ;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
