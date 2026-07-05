package Hashmaps;

import java.util.HashMap;

public class MajorityElem_lc169 {
    public static void main(String[] args) {
        MajorityElem_lc169 solution = new MajorityElem_lc169();

        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1)); // 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2)); // 2

        int[] nums3 = {1};
        System.out.println(solution.majorityElement(nums3)); // 1

        int[] nums4 = {6, 5, 5};
        System.out.println(solution.majorityElement(nums4)); // 5

        int[] nums5 = {7, 7, 7, 2, 3};
        System.out.println(solution.majorityElement(nums5)); // 7
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for ( int num : nums) {
            map.put(num , map.getOrDefault(num , 0) + 1);

            if (map.get(num) > nums.length/2) {
                return num;
            }
        }
        return -1;
    }
}
