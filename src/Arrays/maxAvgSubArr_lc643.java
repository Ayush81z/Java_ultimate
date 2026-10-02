package Arrays;

public class maxAvgSubArr_lc643 {
    public static void main(String[] args) {
        int []nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums , k));
    }

    //sliding window approach
    public static double findMaxAverage(int[] nums, int k) {
        int windowsum = 0;
        for (int i = 0; i < k; i++) { //create a window
            windowsum += nums[i];
        }

        int maxsum = windowsum;

        for (int i = k ; i < nums.length ; i++) { //slide the window
            //here we would be going with add the next value and delete the past value as we move the window
            windowsum += nums[i];
            windowsum -= nums[i-k];

            maxsum = Math.max(windowsum, maxsum);
        }
        return (double) maxsum/k;
    }
}
