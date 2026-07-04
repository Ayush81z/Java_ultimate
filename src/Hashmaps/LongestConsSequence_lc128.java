package Hashmaps;
import java.util.Arrays;

public class LongestConsSequence_lc128 {
    public static void main(String[] args) {
        LongestConsSequence_lc128 solution = new LongestConsSequence_lc128();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(solution.longestConsecutive(nums1)); // 4

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(solution.longestConsecutive(nums2)); // 9

        int[] nums3 = {1, 2, 0, 1};
        System.out.println(solution.longestConsecutive(nums3)); // 3

        int[] nums4 = {};
        System.out.println(solution.longestConsecutive(nums4)); // 0

        int[] nums5 = {9};
        System.out.println(solution.longestConsecutive(nums5)); // 1
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int longestStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // Duplicate, ignore it
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
            else {
                count = 1;
            }
            longestStreak = Math.max(longestStreak, count);
        }
        return longestStreak;
    }
}
