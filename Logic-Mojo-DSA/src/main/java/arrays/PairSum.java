package arrays;

public class PairSum {

	/*
	 * 1. Given a sorted array A (sorted in ascending order), having N integers,
	 * find if there exists any pair of elements (A[i], A[j]) such that their sum is
	 * equal to X.
	 */

	/* For Example: A[] = {10, 20, 35, 50, 75, 80} and the value of X = 110 */
	public static void main(String[] args) {

		int[] nums = { 10, 20, 35, 50, 75, 80 };

		int target = 130;

		System.out.println(isPairSumExist(nums, target));

	}

	public static boolean isPairSumExist(int[] nums, int target) {
		// to check element pair ,whose sum = target we can use two pointer technique
		// to use two pointer technique elements should be sorted in nature
		// if we use nested loop to find pair ,we will end up with time complexity
		// O(n*n) and
		// space complexity is constant time O(1)
		for (int i = 0, j = nums.length - 1; i < j;) {
			int currentSum = nums[i] + nums[j];
			if (currentSum == target) {
				System.out.println("[i,j]" + ":" + "[" + i + "," + j + "]");
				return true;
			} else if (currentSum > target) {
				j--;
			} else {
				i++;
			}
		}
		
		//here after use two pointer technique 
		//time complexity O(n)
		//space complexity O(1)

		return false;
	}
}