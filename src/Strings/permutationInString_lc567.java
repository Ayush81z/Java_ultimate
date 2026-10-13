package Strings;

import java.util.HashMap;

public class permutationInString_lc567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    //permutation substring : in this the substring should be consecutive but the order can differ
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        //initial value fill until the size of s1 for both maps
        for (int i = 0; i < s1.length() ; i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);
        }

        //inital window size
        int  start = 0;
        int end = s1.length();

        //make sure that we dont cross more than s1 size at the end
        for (int i = 0; i <= s2.length()-s1.length(); i++) {
            if (map1.equals(map2)) {
                return true;
            }

            // Don't shift after checking the final window
            if (end == s2.length()) {
                break;
            }

            map2.put(s2.charAt(start) , map2.get(s2.charAt(start))-1);
            //as we do till <s1.length , we can leverage the end before it increases
            if (map2.get(s2.charAt(start)) == 0) {
                map2.remove(s2.charAt(start));
            }

            map2.put(s2.charAt(end), map2.getOrDefault(s2.charAt(end),0)+1);
            start++;
            end++;

        }
        return false;
    }
}
