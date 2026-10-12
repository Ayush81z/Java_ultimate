package Strings;

import java.util.HashMap;

public class LongestSubstringNoRepeat_lc3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        //right keeps the current character index
        for (int right = 0 ; right < s.length() ; right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            //map with the index
            map.put(ch , right);
            maxLength = Math.max(maxLength , right - left +1 );
        }
        return maxLength;
    }
}
