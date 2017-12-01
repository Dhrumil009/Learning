package org.learning.core;

public class MyBox {

	public static void main(String[] args) {
//		Box3d d3=new Box3d(10,20);
//		d3.show();
//		System.out.println(d3.area());
		
		Box2d d2=new Box2d(10);
		d2.a=10;
		d2.show();
	}

}

 class Box2d{
	
	private int len,wid;
	protected int a;
	
	protected Box2d() {
		
	}
	
	protected Box2d(int l){
		this(l,l);
	}
	
	protected Box2d(int l,int w){
		len=l;
		wid=w;
	}
	
	public void show() {
		System.out.println("Length :"+len+" and Width:"+wid);
	}
	
	public int area() {
		return len*wid;
	}
	
}

class Box3d extends Box2d{

	int height;
	
	Box3d(int l,int h) {
		super(l);
		height=h;
	}
	
	public void show() {
		super.show();
		System.out.println("Vol "+height*area());
	}
	
}