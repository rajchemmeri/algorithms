package leet;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class MonotonicArray_896 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isMonotonic(int[] A) {
        if( A.length == 0 || A.length == 1)
          return true;
        int i = 1;
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        boolean isValid = true;
          while( i < A.length && isValid){
              if( A[i] > A[i-1]){
                isIncreasing = true;
              }else if(A[i] < A[i-1]){
                isDecreasing = true;
              }
              if(isIncreasing && isDecreasing)
                isValid = false;
              ++i;
          }

        return isValid;
	}
	
	@Test
	public void testCase1() {
		int[] input = new int[] {1,2,2,3};
		assertSame(true, isMonotonic(input));;
	}
	@Test
	public void testCase2() {
		int[] input = new int[] {6,5,4,4};
		assertSame(true, isMonotonic(input));;
	}
	@Test
	public void testCase3() {
		int[] input = new int[] {1,3,2};
		assertSame(false, isMonotonic(input));;
	}
	@Test
	public void testCase4() {
		int[] input = new int[] {1,2,4,5};
		assertSame(true, isMonotonic(input));;
	}
	@Test
	public void testCase5() {
		int[] input = new int[] {1,1,1};
		assertSame(true, isMonotonic(input));;
	}
}
