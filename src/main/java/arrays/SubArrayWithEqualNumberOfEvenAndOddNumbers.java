package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqualNumberOfEvenAndOddNumbers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2};
    }

    public static int maxSubArrayLength(int[] nums) {
        int maxSubArrayLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] % 2 == 0 ? -1 : 1);

            if (sum == 0) {
                maxSubArrayLength = Math.max(maxSubArrayLength, i + 1);
            } else {
                if (map.containsKey(sum)) {
                    maxSubArrayLength = Math.max(maxSubArrayLength, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxSubArrayLength;

    }
}
