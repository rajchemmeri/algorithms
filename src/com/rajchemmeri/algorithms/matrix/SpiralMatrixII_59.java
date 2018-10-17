package array;

public class SpiralMatrix {

	public static void main(String[] args) {


		SpiralMatrix obj = new SpiralMatrix();
    
		int[][] out = obj.generateMatrix(4);
		
		for(int i = 0;i< 4;++i) {
			for(int  j =0;j< 4;++j) {
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] generateMatrix(int n) {

		int curRow = 0;
		int curCol = 0;
		
		int maxRow = n -1;
		int maxCol = n -1;
		
		int fRow = 0;
		int fCol = 0;

		int[][] out = new int[n][n];

		int i = 1;
		while( i < n*n) {
			
				while( curCol >= 0  && curCol < maxCol) {
				    out[curRow][curCol] = i;
			            ++curCol;
				    ++i;
				}
			  	++fRow;

				while( curRow >=0 && curRow < maxRow ) {
				  out[curRow][curCol] = i;
				  ++curRow;
				  ++i;
				}

				--maxCol;

				while( curCol > fCol ) {
				  out[curRow][curCol] = i;
				  --curCol;
				  ++i;
				}
				--maxRow;
				while( curRow > fRow ) {
				  out[curRow][curCol] = i;
				  --curRow;
				  ++i;
				}
			++fCol;
			
		}
		return out;
	}

}
