package array;

public class MatrixMul {

	public static void main(String[] args) {
            int[][] mat = new int[][]{
                                        {1,2,3},
                                        {4,5,6},
                                        {7,8,9},
                                     };
			              int len = mat.length;
			              int search = 10;
			              boolean found = false;
			              for(int i =0;i < len;++i) {
				                      int j = mat[0].length -1;
                                  while( j >=0 ) {
                                         if( mat[i][j] == search) {
                                            found = true;
                                            break;
                                         }else if( search < mat[i][j]  ) {
                                            --j;
                                         }else {
                                            break;
                                         }
                                    }
                      if(found)
                        break;
			}
							  	 
			System.out.println("IsFound "+found );				  	 
		}
}
