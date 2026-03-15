package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayLengthWithEqualNumberOfZerosAndOnce {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] == 0 ? -1 : 1);
            if (sum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
