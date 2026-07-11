package Hashmaps;

import java.util.*;

public class IntersectionOfArrays2_lc350 {
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
        HashMap<Integer , Integer> set = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            set.put(num, set.getOrDefault(num , 0)+1);
        }

        for (int num : nums2) {
            if (set.containsKey(num) && set.get(num) > 0) { //helps us check if we have added the real result and to avoid any duplicates
                list.add(num);
                set.put(num, set.get(num) - 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0 ; i < list.size() ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
