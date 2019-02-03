package sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSum {

    @Test
    public void testSuccessfulAdd(){
        System.out.println(Arrays.toString(new int []{1,3,5}));
        Sum sum = new Sum();
        int actualSum = sum.add(3, 5);
        int expectedSum = 8;

        Assert.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void testWrongValueFails(){
        Sum sum = new Sum();
        int actualSum = sum.add(3, 5);
        int expectedSum = 9;

        Assert.assertNotEquals(expectedSum,actualSum);
    }

    @Test
    public void testCorrectAddReturnsTrue(){
        Sum sum = new Sum();
        int actualSum = sum.add(3, 5);
        int expectedSum = 8;

        boolean isCorrect = (actualSum ==8);

        Assert.assertTrue(isCorrect);
    }
}
