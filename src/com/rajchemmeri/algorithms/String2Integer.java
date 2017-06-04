package com.rajchemmeri.algorithms;

import java.util.Scanner;

public class String2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		
		double tot = 0;
		
		for(int i =num.length() -1,j=0 ;i>=0 ; --i,++j){
			tot = tot + ((num.charAt(i) - 48) *  Math.pow(10, j));
		}
		
		System.out.println("Total = "+  tot);

		
		int res = 0;
		
		System.out.println("Length : "+ num.length());
		
		for(int k =0; k < num.length(); ++k){
			System.out.println( " char "+ (num.charAt(k) - '0'));
			res = (res * 10) + (num.charAt(k) - '0');
		}
		
		System.out.println("Result "+  res);

	}

}
	


