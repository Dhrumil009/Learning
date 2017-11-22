package org.learning.core;

public class ProtectedFinalize {

	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.show();
		System.out.println("===============");

	}

}

class Test{
	public void show() {
		Box b1=new Box(10);
		b1.show();
		System.out.println(b1);
	}
}

class Box{
	
	int len,wid;
	
	Box(int l){
		this(l,l);
	}
	
	Box(int l,int w){
		len=l;
		wid=w;
	}
	
	public void show() {
		System.out.println("Haha");
	}
	
	public String toString() {
			return "Length :"+len+" and Width:"+wid;
	}
	
	
	protected void finalize() {
		System.out.println("Chalo avjo");
	}
}
