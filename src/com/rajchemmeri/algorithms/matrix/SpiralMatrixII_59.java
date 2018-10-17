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
	public int[][] generateMatrix2(int n) {
		int top = 0 ;
		int left = 0;
		int right = n -1;
		int bottom = n -1;

		int i = 0, j = 0;
		int[][] out = new int[n][n];
		int ct = 1;
		while(ct <= n*n) {

			for(int k =0;k<=right;++k) {
				out[top][k] = ct;
				ct++;
			}
			++top;

			for(int l=top;l<=bottom;++l) {
				out[l][right] = ct;
				ct++;
			}
			--right;

			for(int k= right;k>=left;--k) {
				out[bottom][k] = ct;
				ct++;
			}
			--bottom;

			for(int k= bottom;k>=top;--k) {
				out[k][left] = ct;
				ct++;
			}
			++left;
		}
		return out;
	}
	public int[][] generateMatrix(int n) {//not working

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
