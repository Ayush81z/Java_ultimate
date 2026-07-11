package Hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfArrays_lc349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result1 = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result1)); // [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        int[] result2 = intersection(nums3, nums4);
        System.out.println(Arrays.toString(result2)); // [4, 9] or [9, 4]
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        //just finding the normal common elements among the two array using hashset
        int resultCount = 0;

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
                set.remove(num);
            }
        }
        //tried to find the more optimal way of solving this , but this is the most optimal approach for this problem
        int[] result = new int[res.size()];

        for (int num : res) {
            result[resultCount++] = num;
        }
        return result;
    }
}
