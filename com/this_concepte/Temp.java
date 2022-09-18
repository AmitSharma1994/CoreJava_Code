package com.this_concepte;

public class Temp {

	int x = 100;

	void show(int x, Temp t) {

		System.out.println(t.x);

		System.out.println(x);

	}

	public static void main(String[] args) {

		Temp t = new Temp();
		t.show(200, t);
	}

}
