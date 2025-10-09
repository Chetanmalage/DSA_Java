package learning;

import java.util.*;

public class tableOfN {
	public static void main(String [] arhs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number which you want table: ");
		int number = sc.nextInt();
		int table;
		for(int i =1; i <=10; i++) {
			table = number*i;
			System.out.println(table);
		}
	}

}
