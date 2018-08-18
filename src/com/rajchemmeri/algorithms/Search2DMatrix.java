package array;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] mat = {
				{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}
		};

		int len = mat.length - 1;
    
		int width = mat[0].length;

		int target = 20;
    
		boolean isFound = false;
    
		int j = width - 1;
    
		for( int i = 0;i<len;++i) {

            while( j >= 0) {
                  if(target == mat[i][j]) {
                    isFound = true;
                    break;
                  }else if(target < mat[i][j]) {
                    --j;
                  }else {
                    break;
                  }
            }
            if(isFound)
              break;

		}
		System.out.println(" isFound "+ isFound);
	}

}
