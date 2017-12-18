package org.learning.datastructure;

public class MergeSort {

	
	public void  merge(int arr[],int p, int q, int r) {
		if(arr.length > 0) {
			int l=q-p+1;
			int rt=r-q;
			int left[]=new int[l];
			int right[]=new int[rt];
			
			for(int i=0; i<l ;i++ ) {
				left[i]=arr[p+i];
			}
			
			for(int i=0; i<rt ;i++ ) {
				right[i]=arr[q+1+i];
			}
			
			int i = 0,j=0;
			int k=p;
			
			while(k < l && k < rt) {
				
				if(left[i] < right [j]) {
					arr[k]=left[i];
					i++;
				}
				if(left[i] > right [j]) {
					arr[k]=right[j];
					j++;
				}
				
				k++;
			}
			
			
		      /* Copy remaining elements of L[] if any */
	        while (i < l)
	        {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < rt)
	        {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
			
		}
	}
	
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
