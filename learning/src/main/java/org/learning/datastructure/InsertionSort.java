package org.learning.datastructure;

class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int j=2; j<n; j++)
        {
            int key = arr[j];
            int i = j-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (i>=0 && arr[i] > key)
            {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
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
        int arr[] = {12, 11, 13, 5, 6};
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }
} 
