package practice;


import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an array A of integers, return true if and only if it is a valid mountain array.

   Recall that A is a mountain array if and only if:

    A.length >= 3

    There exists some i with 0 < i < A.length - 1 such that:
        A[0] < A[1] < ... A[i-1] < A[i]
        A[i] > A[i+1] > ... > A[B.length - 1]


 */

public class Leet_941 {

	public static void main(String[] args) {

	}
	public boolean validMountainArray(int[] A) {

          if( A != null && A.length < 3) {
            return false;
          }
          boolean goingUp = false;
          boolean isMaxReached = false;
          boolean isValid = true;
          int i = 1;

          while( i < A.length )  {

              if(!isMaxReached &&  A[i] > A[i-1]) {
                  goingUp = true;
                  ++i;
                  continue;
              }else {
                if( goingUp &&  !isMaxReached  ) {
                    isMaxReached = true;
                    i = i-1;
                }else {
                    if( isMaxReached && A[i] < A[i-1]) {
                        ++i;
                        continue;
                    }else {
                        isValid = false;
                        break;
                    }
                }
                ++i;
            }
		}


		return (isMaxReached && isValid );
	}
  
	@Test
	public void test5() {
		int[] input = new int[] {3,5,5};
		Assert.assertEquals(false, validMountainArray(input));
	}
	@Test
	public void test4() {
		int[] input = new int[] {0,1,2,1,2};
		Assert.assertEquals(false, validMountainArray(input));
	}
	@Test
	public void test3() {
		int[] input = new int[] {9,8,7,6,5,4,3,2,1,0};
		Assert.assertEquals(false, validMountainArray(input));
	}


	@Test
	public void test1() {
		int[] input = new int[] {1,2,3,4,5,6};
		Assert.assertEquals(false, validMountainArray(input));
	}
	@Test
	public void test2() {
		int[] input = new int[] {0,2,0};
		Assert.assertEquals(true, validMountainArray(input));
	}

}
