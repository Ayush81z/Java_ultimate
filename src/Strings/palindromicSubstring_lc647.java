package Strings;

public class palindromicSubstring_lc647 {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int center = 0; center < s.length(); center++) {
            int left = center;
            int right = center;

            //for odd center
            while (left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right) ) {
                count++;
                left--;
                right++;
            }

            left = center;
            right = center+1;
            //for even center
            while (left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right) ) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
