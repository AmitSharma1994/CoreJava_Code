package overloading;

class Derived{
	
	protected final void GetDetail() {
		
		System.out.println("Derived class");
	}
}

public class Test extends Derived {

	protected final void GetDetail() {
		
		System.out.println("Derived class");
	}
	
	
	public static void main(String[] args) {

		Test obj=new Test();
		obj.GetDetail;
	}

}
