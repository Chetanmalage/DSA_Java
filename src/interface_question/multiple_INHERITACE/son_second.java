package interface_question.multiple_INHERITACE;

public class son_second extends grandfather implements father,mother{
	
	public void fatherHome() {
		System.out.println("this is father home");
	}
	
	public void motherHome() {
		System.out.println("this is mother home");
	}
	
	public void son() {
		System.out.println("this is son home");
	}

	public static void main(String areh[]) {
		
		son_second s = new son_second();
		
		s.grandfatherclass();
		s.fatherHome();
		s.motherHome();
		s.son();
	}
}
