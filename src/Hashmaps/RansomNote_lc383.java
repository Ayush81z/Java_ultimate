package Hashmaps;

import SOLID.lsp.Instagram;

import java.util.HashMap;

public class RansomNote_lc383 {
    public static void main(String[] args) {
        RansomNote_lc383 solution = new RansomNote_lc383();

        System.out.println(solution.canConstruct("a", "b"));          // false
        System.out.println(solution.canConstruct("aa", "ab"));         // false
        System.out.println(solution.canConstruct("aa", "aab"));        // true
        System.out.println(solution.canConstruct("abc", "aebfc"));     // true
        System.out.println(solution.canConstruct("abcd", "abc"));      // false
        System.out.println(solution.canConstruct("", "anything"));     // true
        System.out.println(solution.canConstruct("hello", "lloeh"));   // true
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length() ; i++) {
            char ch = magazine.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }

        for (int i = 0; i < ransomNote.length() ; i++) {
            char ch = ransomNote.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch)-1);
        }
        return true;
    }
}
