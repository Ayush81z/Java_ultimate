package Hashmaps;

import java.util.HashMap;

public class wordpattern_lc290 {
    public static void main(String[] args) {
        wordpattern_lc290 solution = new wordpattern_lc290();

        System.out.println(solution.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));  // false
        System.out.println(solution.wordPattern("abba", "dog dog dog dog"));  // false
        System.out.println(solution.wordPattern("abc", "one two three"));     // true
        System.out.println(solution.wordPattern("abc", "one two"));           // false
        System.out.println(solution.wordPattern("aaa", "dog dog dog"));       // true
    }

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(ch, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false;
                }
            } else {
                wordToChar.put(word, ch);
            }
        }

        return true;
    }
}
