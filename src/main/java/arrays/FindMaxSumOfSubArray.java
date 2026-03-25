package arrays;

public class FindMaxSumOfSubArray {

    public static void main(String[] args) {
        int A[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArraySum(A));
    }


    public static int maxSubArraySum(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSumSoFar = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentMaxSum + nums[i]) {
                currentMaxSum = nums[i];
                tempStart = i;
            } else {
                currentMaxSum = currentMaxSum + nums[i];
            }

            if (currentMaxSum > maxSumSoFar) {
                maxSumSoFar = currentMaxSum;
                start = tempStart;
                end = nums[i];
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSumSoFar;
    }
}
