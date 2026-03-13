package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfTwoNumbersEqualsThird {

//	5.	Given an array of integers, you have to find three numbers such that the sum of two elements equals the third element.
//	
//	Input : {5, 32, 1, 7, 10, 50, 19, 21, 2}
//	Output : 21, 2, 19

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNumbers(new int[] { 5, 32, 1, 7, 10, 50, 19, 21, 2,53 }, 53);
		
	

	}

	public static void findNumbers(int nums[], int target) {
		Arrays.stream(nums).mapToObj(i->(Integer)i).collect(Collectors.toList());
		Arrays.asList(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				break;
			}
			if (i == nums.length - 1) {
				throw new RuntimeException(String.format("Target element: %s not part of array elements:%s", target,Arrays.toString(nums)));
			}
		}
		
		Arrays.sort(nums);

		for (int i = 0, j = nums.length - 1; i < j;) {
			if (i < j) {
				int currentSum = nums[i] + nums[j];
				if (currentSum == target) {
					System.out.println(nums[i] + " " + nums[j]);
					break;
				}
				if (target > currentSum) {
					i++;
				} else {
					j--;
				}
			}
		}
		
		//TC:O(n)
		//SC O(1)

	}

}
