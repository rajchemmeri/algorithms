package array;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		/*{
			(0,0),(0,1),(0,2)
			(1,0),(1,2),(1,3)
			(2,0),(2,1),(1,2)
		}*/
		int[][] mat = new int[][]{
									{1,2,3},
									{4,5,6},
									{7,8,9}
								};
		
							/*	int[][] output = new int[][]{
									{1,4,7},
									{2,5,8},
									{3,6,9}
								};*/
								
		int len = mat.length;
		int width = mat[0].length -1;
		int col = width;
		int row = 0;
		int k = 0;
    
		while( row < len) {
			
            while( col > row ) {

                  int t = mat[row][col];

                  mat[row][col] = mat[col][row];

                  mat[col][row] = t;

                  --col;
            }
			
			      row+=1;
			
			      col = width;
		}
		
		for(int i = 0;i<len;++i) {
			for(int j = 0;j< mat[0].length;++j) {
				System.out.print(mat[i][j] + " " );
			}
			System.out.println();
		}
	}

}
