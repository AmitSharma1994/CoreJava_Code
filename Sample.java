
public class Sample {
	
	int num;
	
	Sample(){
	num=10;	
		
	}
	
	
	Sample(int num){
		
		this.num=300;
	}
	
	
code change

	public static void main(String[] args) {
	//System.out.println(new Sample().num);
	
		System.out.println(new Sample().num);
	System.out.println(new Sample(1).num);	

	
	}

}
