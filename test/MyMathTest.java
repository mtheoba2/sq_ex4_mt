// SPDX-License-Identifier: MIT

package test;

import main.MyMaths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
    private MyMaths maths;
    @Before public void init() {
        maths = new MyMaths();
    }
    @Test public void testStatementCoverage () {
        Assert.assertEquals(1,maths.gcd(7,15));
    }
    @Test public void testBranchCoverage () {
        Assert.assertEquals(1, maths.gcd(7,15));
        Assert.assertEquals(5, maths.gcd(10,5));
    }
}
