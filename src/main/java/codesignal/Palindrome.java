package codesignal;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = checkPalindrome("abcba");
        System.out.println(isPalindrome);

    }

    static boolean checkPalindrome(String inputString) {
        int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if(inputString.charAt(i)!= inputString.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }











}
