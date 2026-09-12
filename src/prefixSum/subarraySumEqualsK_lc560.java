package prefixSum;

import java.util.HashMap;

public class subarraySumEqualsK_lc560 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k)) {
                result += map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0) +1);
        }
        return result;
    }
}
