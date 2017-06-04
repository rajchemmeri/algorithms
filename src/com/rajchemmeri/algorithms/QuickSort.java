package com.rajchemmeri.algorithms;

/*
 * 31
 * 26
 * 20
 * 17
 * 44
 * 54
 * 77
 * 55
 * 93
 */
public class QuickSort {
	//int[] numbers = {54, 26, 93, 17, 77, 31, 44, 55, 20};
	int[] numbers = {1, 2, 25, 17};	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] numbers = {54, 26, 93, 17, 77, 31, 44, 55, 20};
		//int[] numbers = {54, 26, 93, 17};

		int[] numbers = {1, 2, 25, 17};	
		QuickSort s = new QuickSort();
		
		s.quicksort(0, numbers.length - 1);
		
		s.print();
	}
	public void print(){
		for(int k=0;k<numbers.length;++k){
			System.out.println(numbers[k] + " ,");
		}
	}
	
	private void quicksort(int low, int high) {
		
		System.out.println( " low : "+low );
		System.out.println( " high : "+high );
		
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];
        
        System.out.println(" Pivot : "+ pivot);

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
            	
                i++;
            }
            System.out.println( " i : "+i);
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
            	
                j--;
            }
            System.out.println( " j : "+j);

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
            System.out.println(" Iteration ends");
        }
        // Recursion
       
        if (i < high){
        	System.out.println( " i < high " + i + " - " + high);
            quicksort(i, high);
        }
        if (low < j){
        	System.out.println( " low < j " + low + " - " + j);
            quicksort(low, j);
        }
    }
	
	private void exchange(int i, int j) {
        int temp = numbers[i];
        System.out.println(" exchange numbers[i]"+ temp + " to numbers[j] "+ numbers[j] );
        numbers[i] = numbers[j];
        numbers[j] = temp;
        
    }

}
