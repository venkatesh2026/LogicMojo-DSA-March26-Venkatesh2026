package arrays;

import java.util.Arrays;

public class TripletSum {

//	2.	Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
//	Examples: Input: arr[] = {0, -1, 2, -3, 1}
//	Output: (0 -1 1), (2 -3 1)
//	Explanation: The triplets with zero sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0  
//
//	Input: arr[] = {1, -2, 1, 0, 5}
//	Output: 1 -2  1
//	Explanation: The triplets with zero sum is 1 + -2 + 1 = 0   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, -1, 2, -3, 1 };
		int target = 0;
		
		printTripletSumElements(arr, target);

	}

	public static void printTripletSumElements(int[] nums, int target) {
		Arrays.sort(nums);

		//outer loop need to go till last 3rd element,because left and right pointer pointing last but one and last
		for (int i = 0; i < nums.length-2; i++) {
			
			for(int j=i+1,k=nums.length-1;j<k;) {
				
				int currentSum=nums[i]+nums[j]+nums[k];
				
				if(currentSum==target) {
					System.out.println("triplet:"+nums[i]+" "+nums[j]+" "+nums[k]);
					j++;
					k--;
				} else if(currentSum>target) {
					k--;
				} else {
					j++;
				}
			}
		}
		
		// TC O(n*n)
		//SC O(1) - Constant time since we are not using any extra data structure other than input array

	}

}
