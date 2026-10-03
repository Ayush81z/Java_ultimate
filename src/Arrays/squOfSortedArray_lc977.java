package Arrays;

import java.util.Arrays;

public class squOfSortedArray_lc977 {
    public static void main(String[] args) {
        int []arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -  1;
        int currPos = nums.length - 1;

        int []result = new int[nums.length];

        //two pointer compare among each end and place the higher number at the end of result
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[currPos] = nums[left] * nums[left];
                left++;
            }
            else {
                result[currPos] = nums[right] * nums[right];
                right--;
            }
            currPos--;
        }
        return result;
    }
}
