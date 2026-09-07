package Strings;

public class SumOfBeauty_lc1781 {
    public static void main(String[] args) {

        SumOfBeauty_lc1781 obj = new SumOfBeauty_lc1781();

        String s = "aabcb";

        int result = obj.beautySum(s);

        System.out.println(result);
    }

    public int beautySum(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                ans += max - min;
            }
        }

        return ans;
    }
}
