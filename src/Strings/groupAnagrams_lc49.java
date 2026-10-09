package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams_lc49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for (String s : strs) {
            //create a array to collect the characters position
            int[] count = new int[26];

            //we increase the count at the places of charcters
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);

            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
