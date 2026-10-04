package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();

        int sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length-2 ; i++) { //we need to have the length-2 to avoid the right being same as i
            left = i+1;
            int right = nums.length -1;

            //to make sure that the i is not duplicated again(same checks for left and right has been added)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    List<Integer> coordinates = new ArrayList<>();
                    coordinates.add(nums[i]);
                    coordinates.add(nums[left]);
                    coordinates.add(nums[right]);

                    resultList.add(coordinates);
                    left++;
                    right--;

                    //we may get duplicates so we just skip those similar pointers (for left and right)
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }

        }
        return resultList;
    }
}
