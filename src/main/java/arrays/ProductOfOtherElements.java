package arrays;

import java.util.Arrays;

public class ProductOfOtherElements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfOtherElements(nums)));
    }

    public static int[] productOfOtherElements(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }
        System.out.println("prefix:"+Arrays.toString(prefixProduct));

        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length-1] = 1;
        for (int i = nums.length-2; i >=0 ; i--) {
            suffixProduct[i] = suffixProduct[i+1]*nums[i+1];
        }
        System.out.println("suffix:"+Arrays.toString(suffixProduct));

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixProduct[i]*suffixProduct[i];
        }
        return result;

    }
}
