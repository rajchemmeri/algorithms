package com.rajchemmeri.algorithms;

/*
 * 13 9 5 1 


14 10 6 2 


15 11 7 3 


16 12 8 4 	
 */
public class MatrixRotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = new int[][]{
			{1,  2,  3,  4 },
			{5,  6,  7,  8 },
			{9, 10, 11, 12 },
			{13,14, 15, 16 },
		 };
		 
		 int totRows = mat.length;
		 
		 
		 for(int row = 0 ; row < totRows / 2 ; ++row){
			 
			int last = totRows - 1 - row;
			
			for(int i = row ;i < last ; ++i){
				
				int pos = i - row;
				
				int temp = mat[row][i];
				
				mat[row][i] = mat[last - pos][row];
				
				mat[last - pos][row] = mat[last][last - pos];
				
				mat[last][last - pos] = mat[i][last];
				
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
