package stack;

import org.junit.Assert;
import org.junit.Test;

public class TestMyStack {
    @Test //Annotation to define a test
    public void testSuccessfullPush() { //method name SHOULD reflect what the test does
        MyStack stack = new MyStack(4); //Constructor call
        stack.push(5); //push method call with parameter(5)
        int actual = stack.pop(); //assign method result to variable actual
        int expected = 5; // assign an expected value
        Assert.assertEquals(expected, actual); //assert results;
    }

    @Test
    public void testOneSuccessfulPop() {
        MyStack stack = new MyStack(4);
        stack.push(5);
        int actual = stack.pop();
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStackSizeNotExceeded() {
        MyStack stack = new MyStack(4);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(6);
        int actual = stack.peek();
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        MyStack stack = new MyStack(4);
        stack.push(3);
        int actual = stack.peek();
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUnableToPopOutOfEmptyStack(){
        MyStack stack = new MyStack(4);
        int actual = stack.pop();
        int expected = -1;
        Assert.assertEquals(expected,actual);
    }
}

