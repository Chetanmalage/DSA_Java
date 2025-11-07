package inheritace_practice;

public class son_in_law extends son{
	
	public void sportBike() {
		System.out.println("This is my son-in-law's Sport Bike.");
	}
	
	public static void main(String [] args) {
		
		son_in_law son = new son_in_law();

		son.farm();
		son.home();
		son.car();
		son.bike();
		son.sportBike();
		
	}

}
