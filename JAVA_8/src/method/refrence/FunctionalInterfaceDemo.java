package method.refrence;

public interface FunctionalInterfaceDemo {

	
	public void singleAbstarctmethod();
	
	default public void  printName() {
		System.out.println("Hello Amit");
	}
	
    public static void printbyid() {
    	System.out.println("this ID");
    }
}
