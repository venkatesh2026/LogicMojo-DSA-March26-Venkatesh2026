package arrays;

import java.util.Arrays;

public class ContainerWithMaxWater {

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxWaterCapacity(nums));
    }

    public static int maxWaterCapacity(int[] nums) {
        int maxWaterCapacity = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int currentCapacity = Math.min(nums[left], nums[right]) * (right - left);
            maxWaterCapacity = Math.max(maxWaterCapacity, currentCapacity);
            if (nums[left] >= nums[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxWaterCapacity;
    }
}
