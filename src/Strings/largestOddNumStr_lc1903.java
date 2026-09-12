package Strings;

public class largestOddNumStr_lc1903 {
    public static void main(String[] args) {
        String str = "35427";
        System.out.println(largestOddNumber(str));
    }

    public static String largestOddNumber(String num) {

        for (int i = num.length()-1 ; i >= 0 ; i--) {
            int realnum = num.charAt(i) - '0';

            if (realnum % 2 != 0) { //check for odd at last position
                return num.substring(0 , i+1);
            }
        }
        return "";
    }
}
