package com.rajchemmeri.algorithms;


//http://stackoverflow.com/questions/31575691/what-is-a-bitmask-and-a-mask
/*
To set a bit to 1: mask = mask | (1 << bitIndex)
To set a bit to 0: mask = mask & ~(1 << bitIndex)
To get a bit (to be able to check it): (mask & (1 << bitIndex)) != 0
 */
public class BitMaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte mask = 1;
		
/*		System.out.println(" Left shit 3 :"+ (1 << 3));
		System.out.println(" mask with OR "+ (mask | (1 << 3)));
		System.out.println(" mask with AND "+ (mask &~ (1 << 3)));*/
		
		//int x = 563365;

		int x = 5662;
		
		//int size = ((int)Math.floor(Math.log10(x))+1);
	boolean isTrue = true;
		while(x > 0){
			int size = ((int)Math.floor(Math.log10(x))+1);
			int pow = (int)Math.pow(10, size-1);
			
			int msb = x/pow;
			int lsb = x%10;
			
			if( msb != lsb){
				isTrue = false;
				break;
			}
			
			x= (int)(x-(msb * pow));
			x/=10;
		}
		
		if( isTrue ){
			System.out.println(" Pallindrome ");
		}else{
			System.out.println("Not Pallindrome ");
		}
	}

}
