package com.rajchemmeri.algorithms;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String input = "Mr Rajesh Chemmeri    ";
		
		int length = input.length();
		
		//count no of spaces
		
		int spaceCount = 0;
		
		for(int i=0;i<length; ++i){
			if(input.charAt(i) == ' '){
				spaceCount+=1;
			}
		}
		
		int totalLength = length + spaceCount * 2;
		
		char[] arr = new char[totalLength];
		
		int j = 0;
		for(int i =0 ;i<length;++i){
			if( input.charAt(i) == ' '){
				arr[j] = '%';
				arr[j+=1] = '2';
				arr[j+=1] = '0';
			}else{
				arr[j] = input.charAt(i);
			}
			j+=1;
		}
		
		String x = new String(arr);
		
		System.out.println(x);
		

	}

}
