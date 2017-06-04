package com.rajchemmeri.algorithms;

public class StringCompression {

	public static void main(String[] args) {
		
		String input = "aabccccaaa";
		
		int consecutive = 0;
		
		StringBuilder compressed = new StringBuilder();
		
		for(int i =0 ;i<input.length() ;++i){
			consecutive+=1;
			
			if(i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1) ){
				compressed.append(input.charAt(i));
				compressed.append(consecutive);
				consecutive = 0;
			}
			
		}

		System.out.println(compressed.toString());
	}

}
