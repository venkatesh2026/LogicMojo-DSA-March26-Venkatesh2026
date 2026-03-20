package arrays;

import java.util.Arrays;

public class ArrangeArrayElements {

    /*
     *
     * 4.	An array contains both positive and negative numbers in random order.
     * Rearrange the array elements so that all negative numbers appear before all positive numbers.
     * */

    public static void main(String[] args) {

        int[] nums = { 11, -13, -5, 6, -7, 5, -3, -6};
        arrangeArrayElements(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void arrangeArrayElements(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            while (left < right && nums[left] < 0) {
                left++;
            }
            while (left < right && nums[right] > 0) {
                right--;
            }

            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

        }
    }
}
