package array;


//Q.No 918
public class MaximumSumCircularSubArray {

	public static void main(String[] args) {

		int[] inp = new int[] { 1,-2,3,-2};

		System.out.println( "Max Sum "+ findMaxSumCircularSubArray(inp));

		inp = new int[] { 5,-3 ,5 };
		System.out.println( "Max Sum "+ findMaxSumCircularSubArray(inp));

		inp = new int[] { 3,-1 ,2, -1 };
		System.out.println( "Max Sum "+ findMaxSumCircularSubArray(inp));

		inp = new int[] { 3,-2 ,2, -3 };
		System.out.println( "Max Sum "+ findMaxSumCircularSubArray(inp));
		
		inp = new int[] { -2, -3, -1 };
		System.out.println( "Max Sum "+ findMaxSumCircularSubArray(inp));
	}

	public static int findMaxSumCircularSubArray(int[] inp) {

		if( inp == null || inp.length == 0) {
			  return 0;
		}
		int max_so_far = inp[0];
		int cur_max = 0;

        for( int i = 1; i <= inp.length;++i ) {
              if( i < inp.length) {
                cur_max = cur_max + inp[i];
              }else {
                cur_max = cur_max + inp[0];
              }
              max_so_far = Math.max(max_so_far, cur_max);

              if(cur_max < 0) {
                cur_max = 0;
              }
        }

		   return max_so_far;
	}

}
