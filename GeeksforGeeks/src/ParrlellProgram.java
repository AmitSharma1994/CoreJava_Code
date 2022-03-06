import com.java.multithreding.RunableExample;

/**
 * 
 */

/**
 * @author Amit Sharma
 *
 */
public class ParrlellProgram {

	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println("");
	}
	public void m2() {
		for(int i=10;i<20;i++) {
			System.out.println(i);
		}
	}
	public void m3() {
		for(int i=21;i<30;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ParrlellProgram pg=new ParrlellProgram();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pg.m1();
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pg.m2();
				
			}
		});
		
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pg.m3();
				
			}
		});
		
		t1.start();
		t1.sleep(1000);
		t2.start();
		t3.start();
	}
	
	
}
