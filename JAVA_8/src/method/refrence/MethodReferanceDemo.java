package method.refrence;

public class MethodReferanceDemo {

	public static void main(String[] args) {
		
		
		/*
		 * This lamda expression which provide the Implemention of SAM of functinal
		 * Interface
		 */
		FunctionalInterfaceDemo fd=()->System.out.println("hello lamda expression");
	 fd.singleAbstarctmethod();
		
		
		/*
		 * This is Method Reference code which is refer the method of Test class which
		 * already provide the implemention of SAM which availble in functional
		 * interface this is uses for code reusablility.
		 */
		
		FunctionalInterfaceDemo fd1=Test::testImplemention;
		
		fd.singleAbstarctmethod();
		
		
	}
	
	
}

class Test{
	 public static void testImplemention() {
		 System.out.println("This is Test Implemention which is refered by method reference");
	 }
}
