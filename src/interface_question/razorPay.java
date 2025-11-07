package interface_question;

public class razorPay implements paymentGateWay{

	public void transactionFail(){
		System.out.println("Transaction Fail");
	}
	public void trasactionSuccess() {
		System.out.println("Transaction Success");
	}
}