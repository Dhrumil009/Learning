package org.learning.core;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEquals {

	public static void main(String[] args) {

//		Student s1=new Student (10,"Dhrumil");
//		Student s2=new Student (10,"Dhrumil");
//		
//		System.out.println(s1.equals(s2));
		
		Map<Student,Integer> sMap=new HashMap<Student,Integer>();
//		sMap.put(s1, 10);
//		sMap.put(s2, 10);
		for(int i=0;i<100;i++) {
			sMap.put(new Student (i,"Dhrumil"), 10);
		}
		
		System.out.println(sMap.size());
		long mili=System.nanoTime();
		System.out.println(sMap.containsKey(new Student(10,"Dhrumil")));
		long end=System.nanoTime();
		System.out.println(end-mili);
	}

}