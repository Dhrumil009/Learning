package org.learning.datastructure;

public class LinearSearch {
	
	public static void main(String... a) {
		System.out.println(search(new int[] {10,20,30,40},20));
	}
	
	static int search(int arr[],int searchNumber) {
		 
		for(int a=0; a<arr.length;a++) {
			//return matched index number
			if(arr[a] == searchNumber) {
				return a;
			}
		}
		//return -1 if no search found	
		return -1;
	}

}

// The time complexity of above algorithm is O(n)