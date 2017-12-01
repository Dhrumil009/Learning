package org.learning.core;

public class StringExample {

	public static void main(String[] args) {
		StrindDefault sdefault=new StrindDefault();
//		System.out.println(sdefault.checkEqual(20, 30));
//		sdefault.show();
//		System.out.println(sdefault.checkEqual("dhrumilMunshi","dhrumil"));
		sdefault.equeals(new Integer(10),10);
//		sdefault.StringBufferExample();
//		System.out.println(new String("DhDrDil").replace('D', 'A'));
	}
}

class StrindDefault{
	public <T> Integer checkEqual(T a, T b) {
		if(a.getClass() == Integer.class) {
			Integer x=(Integer) a;	
			Integer y=(Integer)b;
			return x.compareTo(y);
		}else {
			String x=(String) a;
			String y=(String) b;
			return x.compareTo(y);
		}
		
	}
	
	public void show() {
		String s1="Hello world";
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('o',5));
		System.out.println(s1.indexOf("wor"));
	}
	
	public void equeals(Integer s1,Integer s2) {
		
		if(s1.equals(s2)) {
			System.out.println("same");
		}else {
			System.out.println("Not same");
		}
		
		if(s1 == s2) {
			System.out.println("same");
		}else {
			System.out.println("Not same");
		}
	}
	
	public void StringBufferExample() {
		String s1="dhrumil";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
		sb.insert(7, "Munshi");
		System.out.println(sb.toString());
		System.out.println(sb);
		sb.delete(7, 11);
		System.out.println(sb.toString());
	}
}
