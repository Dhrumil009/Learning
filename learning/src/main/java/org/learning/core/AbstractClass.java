package org.learning.core;

public abstract class AbstractClass {
	static {
		System.out.println("in static block");
	}

	public AbstractClass() {
		System.out.println("Constructor");
	}

	public static String msg="";
	
	abstract public void show();
	abstract public void disp();
	
	public void demo() {
		System.out.println("Just Check");
	}
}

class based extends AbstractClass{

	static {
		System.out.println("in base static block");
	}
	
	based(){
		System.out.println("In based class Cons");
	}
	
	@Override
	public void show() {
		System.out.println("Hello in Show");
		
	}

	@Override
	public void disp() {
		System.out.println("Hello in Disp");
		
	}


}

