package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindBuildingIndexWhoCanHaveOceanView {

    public static void main(String[] args) {
        int[] nums = {4,2,3,1};
        System.out.println(Arrays.toString(indexOfOceanViewBuilding(nums)));
    }

    public static int[] indexOfOceanViewBuilding(int nums[]) {
        List<Integer> buildingIndexes = new ArrayList<>();
        buildingIndexes.add(nums.length - 1);
        int lastBuidlingViedIndex = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] > nums[i] && nums[i - 1] > nums[lastBuidlingViedIndex]) {
                buildingIndexes.add(i - 1);
                lastBuidlingViedIndex = nums[i - 1];
            }
        }
        Collections.reverse(buildingIndexes);
        int[] array = buildingIndexes.stream().mapToInt(x -> x).toArray();
        return array;
    }
}
