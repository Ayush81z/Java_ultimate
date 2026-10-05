package Strings;

public class validPalindrome_lc125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            //skip invalid charcters like ! , "," , :
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            //same but from rare end
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            //same check of equality but in LowerCase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
