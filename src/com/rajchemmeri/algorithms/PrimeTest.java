package com.rajchemmeri.algorithms;

import java.util.Scanner;

public class PrimeTest {
	
	public static void main(String st[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println( "Enter a number : ");
		
		int no = scanner.nextInt();
		
		System.out.println( " The number entered is [ "+ no +" ]");
		
		System.out.println(" Checking prime...");
		
		System.out.println(isPrime(no));
		
	}
	
	
	private static boolean isPrime(final int no){
		
		if( no % 2 == 0)
			return false;
		for ( int i = 3 ; i*i <= no ; i+=2){
			if( no % i == 0)
				return false;
		}
		return true;
	}

}
