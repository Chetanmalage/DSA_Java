package inheritace_practice;

public class broswer_test extends demo {
	public void testBrowserr() {
		System.out.println("browser test");
	}
	
	public static void main(String [] args) {
		
		mobile_test m = new mobile_test();
		
		broswer_test b = new broswer_test();
		
		b.open();
		b.openapp();
		b.login();
		b.testBrowserr();
		
		m.pofilecheck();
	}

}
