package interface_question;

public class paytm implements paymentGateWay{
	
	public void transactionFail(){
		System.out.println("Fail");
	}
	public void trasactionSuccess() {
		System.out.println("Success");
	}
}