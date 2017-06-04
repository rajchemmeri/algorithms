package com.rajchemmeri.algorithms;

public class ValidSubString {

	java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

	String finalStr ="";
	private String findString(final String st){
		char[] chrArry = st.toCharArray();

		for(int j = 0; j<chrArry.length ; ++j){

			if( chrArry[j] == ')' ){
				stack.push(j);
			}else if( chrArry[j] == '(' ){
				int x = stack.pop();
			}
		}

	//	return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[128];
		char p ='a';
		
		x[p]++;
		
		System.out.println(x[96]);
	}

}
