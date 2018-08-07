package array;

public class RemoveElement {

	public static void main(String[] args) {

		int[] input = {3,2,2,1,2};
		int target = 2;
		
		int low = 0;
		int high = input.length -1;
	
		
		
		for(int i=0;i<input.length;++i) {
        if( input[low] != target ) {
            ++low;
            continue;
        }
        if(input[high]== target) {
            --high;
            continue;
        }
        int t = input[low];
        input[low] = input[high];
        input[high] = t;
		}
				
  
    for(int x=0;x<high;++x) {
			System.out.println(input[x]);
		}
	}

}
