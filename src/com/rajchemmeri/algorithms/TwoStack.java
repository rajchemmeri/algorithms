package com.rajchemmeri.algorithms;

public class TwoStack {
	
	int[] stack;
	int size;
	int tp1 = 0;
	int tp2 = 0;
	
	public TwoStack(int size){
		stack = new int[size];
		this.size = size;
		tp1 = -1;
		tp2 = size;
	}
	
	public void push1(int x){
		if ( tp1 < tp2-1){
			tp1 += 1;
			stack[tp1] = x;
			
			System.out.println("tp1" + tp1);
		}else{
			System.out.println(" Stack overflow ");
		}
	}
	public void push2(int x){
		if ( (tp2 - 1) > tp1){
			tp2 -= 1;
			stack[tp2 ] = x;
			System.out.println("tp2"+ tp2);
		}else{
			System.out.println(" Stack overflow ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStack ts = new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        
	}

}
