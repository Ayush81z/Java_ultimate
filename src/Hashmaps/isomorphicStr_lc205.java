package Hashmaps;

import java.util.HashMap;

public class isomorphicStr_lc205 {
    public static void main(String[] args) {
        isomorphicStr_lc205 solution = new isomorphicStr_lc205();

        System.out.println(solution.isIsomorphic("egg", "add"));     // true
        System.out.println(solution.isIsomorphic("foo", "bar"));     // false
        System.out.println(solution.isIsomorphic("paper", "title")); // true
        System.out.println(solution.isIsomorphic("badc", "baba"));   // false
        System.out.println(solution.isIsomorphic("ab", "aa"));       // false
        System.out.println(solution.isIsomorphic("a", "z"));         // true
    }

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) {
                    return false;
                }
            } else {
                mapST.put(chS, chT);
            }

            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) {
                    return false;
                }
            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }


}
