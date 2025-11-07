package interface_question;

public class Main {
	public static void main(String args[]) {
		paymentGateWay pay;
		paymentGateWay pay1;
		
		pay1 = new paytm();
		pay = new razorPay();
		
		pay1.transactionFail();
		pay1.trasactionSuccess();
		
		pay.transactionFail();
		pay.trasactionSuccess();
		
		
	}
}
