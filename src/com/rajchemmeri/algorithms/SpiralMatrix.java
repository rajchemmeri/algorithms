package array;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		char[][] matrix = new char[][] { {  'a', 'b', 'c', 'd', 'e' },
									                   {  'f', 'g', 'h', 'i', 'j' },
									                   {  'j', 'k', 'l', 'm', 'n' },
									                   {  'o', 'p', 'q', 'r', 's' },
									                 };
		int last_row = 	 matrix.length ;
		int last_col =   matrix[0].length;
		
		int i = 0, j = 0;
    
		while(i< last_row && j < last_col) {
			
              for(int k =0;k<last_col;++k) {
                System.out.print(matrix[i][k]);
              }
              ++i;

              for(int l=i;l<last_row;++l) {
                System.out.print(matrix[l][last_col-1]);
              }
              --last_col;

              for(int k= last_col-1;k>=j;--k) {
                System.out.print(matrix[last_row-1][k]);
              }
              --last_row;

              for(int k= last_row-1;k>=i;--k) {
                System.out.print(matrix[k][j]);
              }
              ++j;
		}
		
		
									   
	}

}
