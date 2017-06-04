package com.rajchemmeri.algorithms;

public class StringUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Welcome";
		
		
		int[] unique = new int[128];
		
		char[] carry = input.toCharArray();
		
		for(int i=0 ; i<carry.length ; ++i ){
			if(unique[carry[i]]  ==  0){
				unique[carry[i]]++;
				System.out.println(carry[i]);
			}
		}
	}

}
