package arrays;

import java.util.Map;
import java.util.TreeMap;

public class MinimumMeetingRoomsRequired {

    public static void main(String[] args) {
        int[][] nums = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minRoomsRequired(nums));
    }

    public static int minRoomsRequired(int[][] nums) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int[] num : nums) {
            //meeting state time
            if (map.containsKey(num[0])) {
                map.put(num[0], map.get(num[0]) + 1);
            } else {
                map.put(num[0], 1);
            }

            //meeting end time
            if (map.containsKey(num[1])) {
                map.put(num[1], map.get(num[1]) - 1);
            } else {
                map.put(num[1], -1);
            }
        }
        System.out.println(map);
        int count = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count = count + entry.getValue();
            max = Math.max(max, count);
        }
        return max;
    }
}
