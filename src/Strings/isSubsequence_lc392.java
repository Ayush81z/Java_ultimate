package Strings;

public class isSubsequence_lc392 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s ,  t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        //here we just dont want the checks we also want to check if it is present in the same order as present in string
        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j) ) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
