package inheritace_practice;

public class son extends father{
	
	public void bike() {
		System.out.println("This is my bike.");
	}
	
	public static void main(String [] args) {
		
		son s = new son();
		
		s.farm();
		s.home();
		s.car();
		s.bike();
	}
}
