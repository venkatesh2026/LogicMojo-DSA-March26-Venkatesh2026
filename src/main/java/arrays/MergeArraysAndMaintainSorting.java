package arrays;

import java.util.Arrays;

/*
2.	Given two sorted arrays, X[] and Y[] of size m and n each, merge elements of X[]
with elements of array Y[] by maintaining the sorted order, i.e., fill X[] with the first m smallest elements
and fill Y[] with remaining elements.
*/

public class MergeArraysAndMaintainSorting {

    public static void main(String[] args) {

        int X[] = {1, 4, 7, 8, 10};
        int Y[] = {2, 3, 9};

        mergeAndMaintainSortingOrder(X, Y);

    }

    public static void mergeAndMaintainSortingOrder(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        for (int i = 0; i < m; i++) {
            if (nums1[i] > nums2[0]) {
                nums1[i] = nums1[i] + nums2[0];
                nums2[0] = nums1[i] - nums2[0];
                nums1[i] = nums1[i] - nums2[0];
            }

            for (int j = 0; j < n - 1; j++) {
                if (nums2[j] > nums2[j + 1]) {
                    nums2[j] = nums2[j] + nums2[j + 1];
                    nums2[j + 1] = nums2[j] - nums2[j + 1];
                    nums2[j] = nums2[j] - nums2[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));


    }
}
