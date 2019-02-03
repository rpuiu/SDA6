package fib;

import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciCalculataor {

    @Test
    public void testCorrectFirstFibNumber(){
        FibonacciCalculator w = new FibonacciCalculator();
        int expectedResult =0;
        int actualResult = w.getTerm(0);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectSecondFibNumber(){
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int expectedResult =1;
        int actualResult = fibonacciCalculator.getTerm(1);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectAnyFibNumber(){
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int expectedResult =3;
        int actualResult = fibonacciCalculator.getTerm(4);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
