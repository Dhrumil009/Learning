package Demo;

public class Box2d {

private int len,wid;
	
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
