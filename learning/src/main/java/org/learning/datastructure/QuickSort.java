package org.learning.datastructure;

public class QuickSort {
	
	public int partition(int arr[],int start,int end) {
		
		int x=arr[end];
		int i=start-1;
		
		for(int j=start; j<=end-1;j++) {
			
			if(arr[j] < x ){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		
		return i+1;
	}
	
	public void quickSort(int arr[],int start,int end) {
		if(start<end) {
			int mid=partition(arr, start, end);
			quickSort(arr, start, mid-1);
			quickSort(arr, mid+1, end);
		}
	}


	public static void main(String... st) {
		QuickSort quick=new QuickSort();
		int arr[]={10,90,8,20,110,30};
		quick.quickSort(arr, 0, arr.length-1);
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
