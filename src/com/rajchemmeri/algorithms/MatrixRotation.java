package com.rajchemmeri.algorithms;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = new int[][]{
									{1,  2,  3,  4 , 21},
									{5,  6,  7,  8,  22},
									{9, 10, 11, 12,  23},
									{13,14, 15, 16,  24},
									{41,42, 43, 44,  45},
								 };
								 
		int length = mat.length;
		
		System.out.println( " The Length of the matrix : "+ length);
		
		
		
		
		
		for(int row = 0; row< length/2 ; ++row ){
			
			int last = length - 1 - row;
			
			for(int i = row ;i < last; ++i){
			
				int pos = i - row;
				
				int temp = mat[row][i];
				
				//System.out.println( " Temp " + temp);
				
				mat[row][i] = mat[last - pos][row];
				
				mat[last - pos][row] = mat[last][last -pos];
				
				mat[last][last -pos] = mat[i][last];
				
				mat[i][last] = temp;
				
				
			}
			
		}
		
		for(int i=-0;i<mat.length;++i){
			for(int j=0;j<mat[i].length ;++j){
				System.out.print( mat[i][j] + " ");
			}
			System.out.println();
		}
 
	}

}
