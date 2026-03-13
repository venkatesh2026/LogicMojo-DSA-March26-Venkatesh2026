package arrays;

import java.util.Arrays;

public class RemoveDuplicatesAndReturnUniqueCount {

//	3.	Given a sorted array, remove all duplicates and return the length of the modified array solution.
//			Examples: nums = {1, 1, 2, 2, 2, 3, 4, 4}; Output: 4

	public static void main(String[] args) {
		System.out.println(removeDuplicatesAndReturnLength(new int[] { 1, 1, 2, 2, 2, 3, 4, 4 }));

	}

	public static int removeDuplicatesAndReturnLength(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[k] = nums[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(nums));

		return k;
	}

	// TC O(n)
	// SC O(1)
}