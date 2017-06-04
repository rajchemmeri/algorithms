package com.rajchemmeri.algorithms;

public class BaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "615A";
		int base = 16;
		
		int result = 0;
		
		for(int k=0;k < num.length();++k){
			result = result * base + (Character.isDigit(num.charAt(k)) ?  num.charAt(k) - '0': num.charAt(k) - 'A' + 10);
		}
		
		System.out.println( " Converted String "+result);
	}

}
