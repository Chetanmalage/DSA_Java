package inheritace_practice;

public class father {
	
	public void farm() {
		System.out.println("This is my father farm.");
	}
	
	public void home() {
		System.out.println("This is my father house.");
	}
	
	public void car() {
		System.out.println("This is my father car.");
	}
	
public static void main(String [] args) {
		
		father f = new father();
		
		f.farm();
		f.home();
		f.car();
	}
}
