package arrays;

public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(findMajorityElementElseThrowException(new int[]{3, 4, 3, 2, 4, 4, 2, 4}));
    }

    public static int findMajorityElementElseThrowException(int[] nums) {

        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate ==nums[i]) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new RuntimeException("No Majority element found in input array.");
        }
    }
}
