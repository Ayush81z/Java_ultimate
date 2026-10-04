package Arrays;

import java.util.Arrays;

public class ThreeSumClosest_lc16 {
    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums , target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length-2 ; i++) {

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                //based on the three pointers position
                int sum = nums[i] + nums[left] + nums[right];

                //check if the closest older value is closer to target or sum is
                if (Math.abs(closest - target) > Math.abs(sum - target)) {
                    closest = sum;
                }

                if (sum > target) right--;
                else if (sum < target) left++;
                else return sum;
            }
        }
        return closest;
    }
}
