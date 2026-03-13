package arrays;

import java.util.Arrays;

public class MoveZeroToArrayEnd {

//	4.	Given an array of integers, move all the zeros to the end of the array while maintaining the relative order of the other elements. 
//	Input: Arr[]={10,23,0,53,0,21,0}
//	Output: Arr[]={10,23,53,21,0,0,0}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeros(new int[] { 10, 23, 0, 53, 0, 21, 0 });

	}

	public static void moveZeros(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		
		for(j=j+1;j<nums.length;j++) {
			nums[j]=0;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	//TC O(n)
	//SC O(1)

}
