package arrays;

import java.util.Arrays;

public class FindDuplicatesInArrayOfSize_N {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
       findDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                System.out.println(Math.abs(nums[i]));
            } else {
                nums[index] = - nums[index];
            }
        }
    }
}
