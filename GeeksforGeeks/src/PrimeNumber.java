/**
 * 
 */

/**
 * @author Amit Sharma
 *
 */
public class PrimeNumber {

	
	
	
	public static void main(String[] args) {
		
	
		String num="1234";
		//String out="000123"
		
		StringBuilder sb=new StringBuilder();
		
		char[] ch=num.toCharArray();
		//System.out.println(ch.length); //ch.length;
		
		for(int i=0;i<ch.length;i++) {
			sb.append("0");
		}
		sb.append(num);
		
		System.out.println(sb.toString());

	}
			
}
