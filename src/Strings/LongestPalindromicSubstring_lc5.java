package Strings;

public class LongestPalindromicSubstring_lc5 {
    public static void main(String[] args) {
        String s = "babab";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String longest = "";

        for (int center = 0; center < s.length() ; center++) {
            int left = center;
            int right = center;

            String odd = ExpandString(s , left , right);

            left = center;
            right = center+1;

            String even = ExpandString(s , left , right);

            if (odd.length() > longest.length()) {
                longest = odd;
            }

            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }

    public static String ExpandString(String s , int left , int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++; //babab
        }
        //after final expansion the left goes to -1 so recover that we need left+1 here
        return s.substring(left+1 , right);
    }
}
