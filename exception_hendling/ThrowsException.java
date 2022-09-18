package exception_hendling;
import java.io.*; 
public class ThrowsException {

	static void show()throws IOException{
		throw new IOException("throws Example");
	}
	public static void main(String[] args) {
		
		try {
			show();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
