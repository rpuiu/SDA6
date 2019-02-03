package codesignal;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {

    @Test
    public void testPalindrome(){
        Palindrome p = new Palindrome();
        boolean iPaldindrome = Palindrome.checkPalindrome("aaabccaaa");
        Assert.assertEquals(true, iPaldindrome);
    }
}
