package com.rajchemmeri.algorithms;

public class ArrayPartition {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,26,3,4,9,5,5,7,8};
		
		int i = 0;
		
		int j = arr.length - 1;
		
		while( i < j ){
			
			if( arr[i] % 2 != 0){
				if( arr[j] % 2 == 0 ){
					int x = arr[j];
					arr[j] = arr[i];
					arr[i] = x;
					++i;
					--j;
				}else{
					--j;
				}
				
			}else{
				++i;
			}
			
			
		}
		
		System.out.println(" Printing .....");
		
		for(int k = 0;k< arr.length ; ++k){
			System.out.println( arr[k] + " ,");
		}
		
	}

}
