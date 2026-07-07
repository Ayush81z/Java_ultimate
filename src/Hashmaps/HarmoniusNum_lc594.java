package Hashmaps;

import java.util.HashMap;

public class HarmoniusNum_lc594 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                max = Math.max(max, map.get(key) + map.get(key + 1));
            }
        }

        return max;
    }
}
