package arrays;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {

    public static void main(String[] args) {

        double arrivals[] = {2.00, 2.10, 3.00, 3.20, 3.50, 5.00};
        double depatures[] = {2.30, 3.40, 3.20, 4.30, 4.00, 5.20};
        System.out.println(findMinimumNumberOfPlatforms(arrivals, depatures));
    }

    public static int findMinimumNumberOfPlatforms(double[] arrivals, double[] depatures) {
        Arrays.sort(arrivals);
        Arrays.sort(depatures);

        int i = 1, j = 0, platforms = 1, maxPlatforms = 1;
        while (i < arrivals.length && j < depatures.length) {
            if (arrivals[i] < depatures[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
