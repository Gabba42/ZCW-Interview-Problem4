package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem4Test {

    Problem4 prob4Test;
    @Before
    public void setUp() {
        prob4Test = new Problem4();
    }

    @Test
    public void yesCanFormPalindrome() {
        String expected = "YES";
        String actual = prob4Test.canFormPalindrome("cdcdcdcdeeeef");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void noCannotFormPalindrome() {
        String expected = "NO";
        String actual = prob4Test.canFormPalindrome("cdefghmnopqrstuvw");
        Assert.assertEquals(expected, actual);
    }

}
