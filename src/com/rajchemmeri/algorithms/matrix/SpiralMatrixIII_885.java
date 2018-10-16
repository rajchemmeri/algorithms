package leet;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixIII_885 {

	public static void main(String[] args) {
        int [] input = new int[] { 1,2,3,4};
        SpiralMatrixIII_885 obj = new SpiralMatrixIII_885();

        int[][] output = obj.spiralMatrixIII(1, 4, 0, 0);

        for(int i = 0;i<output.length;++i) {
          for(int j = 0;j<output[0].length;++j) {
            System.out.print(output[i][j]);
          }
          System.out.println();
        }

	}
	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {

		int totalSteps = R * C;


		int start = 1;
		

		int[][] output = new int[R*C][2];
		int k = 0;
		
		
		int noOfSteps = 0;
		
		
		int cRow = r0;
		int cCol = c0;
		
		
		while( start <= totalSteps) {
			
			 noOfSteps = noOfSteps + 1;
			 int i = 1;
			 
			 while( i <= noOfSteps) {
				   if( (cRow >= 0 && cRow< R) && (cCol >=0 && cCol < C) ) {
				     int[] res = new int[] {cRow,cCol};
				     output[k++] = res;
				     ++start;
				   }
				   ++i;
				   ++cCol;
			 }
			
			 i = 1;
			 while( i <= noOfSteps) {
				   if( (cRow >= 0 && cRow< R) && (cCol >=0 && cCol < C) ) {
				     int[] res = new int[] {cRow,cCol};
				     output[k++] = res;
				     ++start;
				   }
				   ++i;
				   ++cRow;
			 }
			 
			 i = 1;
			 noOfSteps = noOfSteps + 1;
			 while( i <= noOfSteps) {
				   if( (cRow >= 0 && cRow< R) && (cCol >=0 && cCol < C) ) {
				     int[] res = new int[] {cRow,cCol};
				     output[k++] = res;
				     ++start;
				   }
				   ++i;
				   --cCol;
			 } 
			 
			 i = 1;
			 while( i <= noOfSteps) {
				   if( (cRow >= 0 && cRow< R) && (cCol >=0 && cCol < C) ) {
				     int[] res = new int[] {cRow,cCol};
				     output[k++] = res;
				     ++start;
				   }
				   ++i;
				   --cRow;
			 } 
			
		}

		return output;
	}
}
