package com.tenexperts.summatra.array;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SimpleSummaterTest {
    private SimpleSummater summater;
    @Before
    public void setUp() {
        this.summater = new SimpleSummater();
    }

    @Test
    public void shouldReturnOneHundred() {
        int[] original = {10, 20, 30, 40};
        int sum = this.summater.sum(original);
        Assert.assertEquals(100, sum);
    }

    @Test
    public void shouldReturnTwo() {
        int[] original = {1, 0, 1, 0};
        int sum = this.summater.sum(original);
        Assert.assertEquals(2, sum);
    }

    @Test
    public void shouldReturnFifty() {
        int[] original = {10, 14, 1, 25};
        int sum = this.summater.sum(original);
        Assert.assertEquals(50, sum);
    }
}
