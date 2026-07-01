package Hashmaps;

import java.util.HashMap;

public class validAnagram_lc242 {
    public static void main(String[] args) {
        validAnagram_lc242 solution = new validAnagram_lc242();

        System.out.println(solution.isAnagram("anagram", "nagaram")); // true
        System.out.println(solution.isAnagram("rat", "car"));          // false
        System.out.println(solution.isAnagram("", ""));                // true
        System.out.println(solution.isAnagram("a", "ab"));             // false
        System.out.println(solution.isAnagram("listen", "silent"));    // true
    }

    public boolean isAnagram(String s , String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) +1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch =  t.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch,map.get(ch)-1);

            if (map.get(ch)==0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
