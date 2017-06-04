package com.rajchemmeri.algorithms;

import java.util.Scanner;

public class ColumnSpreadSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColumnSpreadSheet obj = new ColumnSpreadSheet();

		int x = obj.convertColumName2Number();

		obj.convertColumnNumber2Name(x);

	}

	private int convertColumName2Number(){
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		int result = 0;

		for(int i=0;i<input.length();++i){
			result = result * 26 + (input.charAt(i) - 'A' + 1);
		}
		System.out.println( " Result " + result);

		return result;
	}

	private void convertColumnNumber2Name(int no){

		int qt  = 0;
		StringBuilder builder = new StringBuilder();


		if( no < 26 ){
			System.out.println((char)('A' - 1 + no));
		}else{
			qt = no/26;
			for(int i = 0;i< qt;++i){
				builder.append("A");
			}
			qt = no%26;
			char c  = (char)('A'- 1 +  qt) ;
			builder.append(c);

			System.out.println( " columnNo2Name " +builder.toString());
		}
	}
}
