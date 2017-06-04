package com.rajchemmeri.algorithms;

public class NoOfBitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		
		/*short count = 0;
		
		while(x != 0){
			count += (x & 1);
			x >>>= 1;
		}
		System.out.println( " Total count is one bit for 1"+ count);
		short res = 0;
		x =7;
		while(x!=0){
			res ^= 1;
			x &= (x -1);
			System.out.println("@@@@@@@@@@@ X = "+x);
		}
		System.out.println( "parity for 9(1 bit) "+res);*/
		
		System.out.println(" Bitmask "+ (1 << 6));
		
		/*System.out.println( " ~2 :"+ (~(~2)));
		
		System.out.println( " (7>>>1) is "+ (7>>>1));
		
		System.out.println( " Math.abs(-34.56) "+ Math.abs(-34.56));
		
		System.out.println( " Math.ceil(2.17) "+ Math.ceil(2.17));
		
		System.out.println( " Math.floor(3.14) "+ Math.floor(3.14));
		
		System.out.println( " Math.min(2, -4) "+ Math.min(2, -4));
		
		System.out.println( " Math.max(2, -4) "+ Math.max(2, -4));
		
		System.out.println( " Math.pow(2, 4) "+ Math.pow(2, 4));
		
		System.out.println( " Math.pow(2, 0) "+ Math.pow(2, 0));
		
		System.out.println( " Math.sqrt(225) "+ Math.sqrt(225));*/
		
		System.out.println(" ************************************ ");
		
		x = 9;
		
		short result = 0;
		while (x != 0) {
			result ^= 1;
			System.out.println( " result to "+ result);
			x &= (x - 1); // Drops the lowest set bit of x.
			System.out.println( " Drops to "+x);
		}
		
		System.out.println( " Parity : "+ result);
	}

}

