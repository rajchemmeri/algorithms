package array;

public class CreateSpiralMatrix {

	public static void main(String[] args) {
		
		/*
		 * 
     { {  '1' , '2', '3', '4', '5' },
			{  '14', '15', '16', '17', '6' },
			{  '13', '20', '19', '18', '7' },
			{  '12', '11', '10', '9', '8' },
 
		 */
		
		int[][] matrix = new int[4][5];
		
		int last_row = matrix.length;
		int last_col = matrix[0].length;
		
		int i=0,j=0;
		int counter = 0;
    
		while( i< last_row && j < last_col) {
			
              for(int k = j;k<last_col;++k) {
                matrix[i][k] = ++counter;
              }
              
              ++i;
              
              for(int k = i;k<last_row;++k) {
                matrix[k][last_col-1] = ++counter;
              }
              --last_col;

              for(int k =last_col-1;k >=j; --k) {
                matrix[last_row-1][k] = ++counter;
              }
              
              --last_row;
              
              for(int k =last_row-1;k>=i;--k) {
                matrix[k][j] = ++counter;
              }
              ++j;
		}
		
		for(int k =0;k<matrix.length;++k) {
    
        for(int l =0;l<matrix[0].length;++l) {
        
            System.out.print(matrix[k][l]+ " ,");
            
        }
			  System.out.println();
		}
	}

}
