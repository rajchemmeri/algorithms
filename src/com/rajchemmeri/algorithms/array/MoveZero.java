import org.junit.Assert;
import org.junit.Test;
/*
 * 283. Move Zeroes
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Example:

	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Note:

	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 * 
 */
public class MoveZero {

	/*
	 * 
	 * Input: [0,1,0,3,12] Output: [1,3,12,0,0]
	 * 
	 * i = 0 , j = 1 [1,0,0,3,12] i =1 , j =2 [1,0,0,3,12] i =1 , j = 3 [1,3,0,0,12]
	 * i =2 , j = 4 [1,3,12,0,0]
	 * 
	 */
	public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        if (nums == null)
          return;
        if (nums.length == 0)
          return;
        while (j < nums.length) {
          if (nums[i] == 0 && nums[j] != 0) {
            swap(nums, i, j);
            ++i;
          }
          ++j;
        }

	}

	private static void moveZeroesWithoutSwap(int[] nums) {
		int slow = 0;
		int i = 0;

		if (nums == null)
			return;

		if (nums.length == 0)
			return;

		while (i < nums.length) {
			if (nums[i] != 0) {
				nums[slow] = nums[i];
				++slow;
			}
			++i;
		}
		for (int k = slow; k < nums.length; ++k) {
			nums[k] = 0;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	
	  @Test public void test1() { int[] nums = new int[] {0,1,0,3,12};
	  moveZeroes(nums); Assert.assertArrayEquals(new int[] {1,3,12,0,0}, nums); }
	  
	  @Test public void test2() { int[] nums = new int[] {0,0,0,3,12};
	  moveZeroes(nums); Assert.assertArrayEquals(new int[] {3,12,0,0,0}, nums); }
	  
	  @Test public void test3() { int[] nums = new int[] {1,2,3,0};
	  moveZeroes(nums); Assert.assertArrayEquals(new int[] {1,2,3,0}, nums); }
	  
	  @Test public void test4() { int[] nums = new int[] {}; moveZeroes(nums);
	  Assert.assertArrayEquals(new int[] {}, nums); }
	  
	  @Test public void test5() { int[] nums = null; moveZeroes(nums);
	  Assert.assertArrayEquals(null, nums); }
	 

	@Test
	public void test6() {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		moveZeroesWithoutSwap(nums);
		Assert.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
	}
	
	  @Test public void test7() { int[] nums = new int[] {0,0,0,3,12};
	  moveZeroesWithoutSwap(nums); Assert.assertArrayEquals(new int[] {3,12,0,0,0},
	  nums); }
	  
	  @Test public void test8() { int[] nums = new int[] {1,2,3,0};
	  moveZeroesWithoutSwap(nums); Assert.assertArrayEquals(new int[] {1,2,3,0},
	  nums); }
	  
	  @Test public void test9() { int[] nums = new int[] {};
	  moveZeroesWithoutSwap(nums); Assert.assertArrayEquals(new int[] {}, nums); }
	  
	  @Test public void test10() { int[] nums = null; moveZeroesWithoutSwap(nums);
	  Assert.assertArrayEquals(null, nums); }
	 
}
