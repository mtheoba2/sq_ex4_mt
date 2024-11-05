// SPDX-License-Identifier: MIT

package test;


import main.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StackTest {
    private Stack stack;


    @Before public void init() {
        stack = new Stack(3);
    }


    @Test public void testIsEmpty() {
        Assert.assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertFalse(stack.isEmpty());
    }
    @Test public void testSize() {
        stack.push(1);
        Assert.assertEquals(stack.size(), 1);
    }
    @Test(expected=IllegalArgumentException.class) public void testUnsuccessfulPush() {
        stack.push(-1);
    }

    @Test(expected=StackOverflowError.class) public void testMaxSize() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

    }

    @Test public void testPop() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1,stack.pop());
    }
    @Test public void testTopEmptyStack() {
        Assert.assertEquals(-1,stack.top());
    }
    @Test public void testTopStack() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2,stack.top());
        Assert.assertEquals(2,stack.size());
    }

}
