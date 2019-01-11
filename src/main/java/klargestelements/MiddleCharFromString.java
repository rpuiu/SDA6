package klargestelements;

public class MiddleCharFromString {

    public static void main(String[] args) {
        String testString = "aaafbaaa";
        String testString2 = "aaaXaaa";
        displayMiddleChar(testString);
        displayMiddleChar(testString2);

    }

    private static void displayMiddleChar(String testString) {
        int length = testString.length();
        System.out.println("String length = " + length);

        if(length%2!=0){
            int position = length / 2;
            System.out.println(testString.charAt(position));
        }else{
            char c2 = testString.charAt(length / 2);
            char c1 = testString.charAt(length / 2-1);
            System.out.println(String.valueOf(c1)+String.valueOf(c2));
        }

    }
}
