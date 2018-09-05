package array;

public class RangeSumQuery2D {
	
	int[][] data;
	
	public RangeSumQuery2D(int[][] input) {
		
		this.data = input;
		for(int i=0;i< this.data.length;++i) {
			
			for(int j = 1;j<data[0].length;++j) {
				
				this.data[i][j] = this.data[i][j-1] + this.data[i][j];
				
			}
		}
		
	}
	public int sumRegion(int row1, int col1, int row2, int col2) {
		int result = 0;
		
		for(int i = row1; i<=row2;++i) {
			
			result = result + ((col1 == 0)?this.data[i][col2]:data[i][col2] - data[i][col1-1]);
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int[][] matrix = new int[][] 
			{
			  {3, 0, 1, 4, 2},
			  {5, 6, 3, 2, 1},
			  {1, 2, 0, 1, 5},
			  {4, 1, 0, 1, 7},
			  {1, 0, 3, 0, 5}
			};
		
			/* 
			 * int[][] matrix = new int[][] 
			{
			  {3, 3,  4,   8, 10},
			  {5, 11, 14, 16, 17},
			  {1,  3,  3,  4,  9},
			  {4,  5,  5,  6, 13},
			  {1,  1,  4,  4,  9}
			};						
			 */
		RangeSumQuery2D obj = new RangeSumQuery2D(matrix);
		
		System.out.println(obj.sumRegion(1, 2, 2, 4));
		System.out.println(obj.sumRegion(1, 1, 2, 2));
    System.out.println(obj.sumRegion(1, 2, 2, 4));
	}

}
