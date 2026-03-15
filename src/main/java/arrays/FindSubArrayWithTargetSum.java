package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSubArrayWithTargetSum {

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5}, targetSum = 33;
        //System.out.println(Arrays.toString(findSubArray(arr, targetSum)));
        System.out.println(Arrays.toString(findSubArrayHashMap(arr, targetSum)));
    }

    public static int[] findSubArray(int[] nums, int target) {
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum > target) {
                sum = sum - nums[left];
                left++;
            }
            if (sum == target) {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }

    public static int[] findSubArrayHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == target) {
                return new int[]{0, i};
            }
            if (map.containsKey(sum - target)) {
                System.out.println(map);
                return new int[]{map.get(sum - target) + 1, i};
            } else {
                map.put(sum, i);
            }
        }
        return new int[]{};
    }
}