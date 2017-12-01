package org.learning.core;

import java.util.Comparator;

public class CustomComparator implements Comparator<Car>{

	public int compare(Car o1, Car o2) {
		if(o1.getPrice() > o2.getPrice()){
			return -1;
		}else if(o1.getPrice() < o2.getPrice()){
			return 1;
		}
		return 0;
	}
	

}