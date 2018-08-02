package array;

import java.util.Arrays;

public class LongestIncreasingSequence {

	public static void main(String[] args) {

		int[] input = new int[] { 3, 4, -1, 0, 6, 2, 3};
		//int[] input = new int[] { 2,5,1,8,3};

		int[] tempArr = new int[input.length];

		Arrays.fill(tempArr, 1);

		int length  = input.length-1;
		
		int i = 1;
		int j = 0;
		while(i <= length) {
			 j =0;
			while(j < i) {
				if( input[j] < input[i]) {
					tempArr[i] = Math.max(tempArr[i], tempArr[j] + 1);
				}
				++j;
			}
			++i;
		}
		
		int max = 0;
		for(int x : tempArr) {
			max = Math.max(max, x);
		}
		System.out.println(" "+ max);


	}

}
