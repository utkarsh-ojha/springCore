package com.springCore.CI;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor double,double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor int,int");
	}
	

	
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

	public void sum() {
		System.out.println("Sum is :"+(this.a+this.b));
	}

}
