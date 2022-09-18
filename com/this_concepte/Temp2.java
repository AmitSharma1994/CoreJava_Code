package com.this_concepte;

public class Temp2 {
int x=10;


  void show(Temp2 this , int x  ) {
    System.out.println(this.x);
	System.out.println(x);
	
	
	

}


	public static void main(String[] args) {
		Temp2 t2= new Temp2();
		t2.show(20   );
//System.out.println(t2.x);
	}

}
