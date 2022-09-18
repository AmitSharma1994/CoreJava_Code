package exception_hendling;

public class CallingChain {

	void show(){
	int x=10/0;
		
	}
	
	void Display() {
		show();
	}
	
	void xyz() {
		Display();
	}
	
	
	public static void main(String[] args) {
		
	try {
	
		new CallingChain().xyz();
	}
	catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}

	}

}
