package interface_question.multiple_INHERITACE;

import interface_question.paymentGateWay;
import interface_question.paytm;
import interface_question.razorPay;

public class son implements father, mother {
	
	public void fatherHome() {
		System.out.println("Father home");
	}

	public void motherHome() {
		System.out.println("Mother home");
	}
	
	public void sonhome() {
		System.out.println("Son home");
	}
	
	public static void main(String args[]) {
		
		son s = new son();
		
		s.fatherHome();
		s.motherHome();
		s.sonhome();
	
	}
}
