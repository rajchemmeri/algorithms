package com.rajchemmeri.algorithms;

public class Stack {
	
	int[] stack;
	int size;
	static int counter = -1;

	public Stack(int s){
		
		this.size = s;
		stack = new int[size];
		
	}
	
	private void put(int e){
		stack[++counter] = e;
	}
	
	private int get(){
		return stack[counter];
	}
	
	private int pop(){
		int x = stack[counter];
		size = size - 1;
		return x;
	}
	
	private void print(){
		for(int j= 0; j<size; ++j){
			System.out.println ( stack[j]);
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.put(1);
		st.put(2);
		st.put(3);
		st.put(4);
		st.put(5);
		
		st.print();
		
		System.out.println(" Get top element ");
		System.out.println ( st.get() );
		
		System.out.println(" Pop on stack");
		System.out.println ( st.pop() );
		
		st.print();
		
	}

}
