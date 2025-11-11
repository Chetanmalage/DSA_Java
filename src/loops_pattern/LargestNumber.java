package loops_pattern;

public class LargestNumber {
	
	public static void main(String[] args) {
        int a = 25, b = 42, c = 31;

        if (a >= b && a >= c)
            System.out.println(a + " is the largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest");
        else
            System.out.println(c + " is the largest");
    }

}
