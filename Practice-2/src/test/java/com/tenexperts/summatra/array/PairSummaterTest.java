package com.tenexperts.summatra.array;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class PairSummaterTest {
    private PairSummater pairSummater;
    @Before
    public void setUp() {
        this.pairSummater = new PairSummater();
    }

    @Test
    public void shouldReturnTwentySix() throws ArraySummaterException {
        int[] original = {10, 2, 1, 25};
        int sum;
        sum = this.pairSummater.sum(original);
        Assert.assertEquals(26, sum);
    }
    @Test
    public void shouldReturnFiftyFive() throws ArraySummaterException {
        int[] original = {10, 20, 25, 30};
        int sum;
        sum = this.pairSummater.sum(original);
        Assert.assertEquals(55, sum);
    }
    @Test
    public void shouldReturnThirty() throws ArraySummaterException {
        int[] original = {10, 20, 1, 25};
        int sum;
        sum = this.pairSummater.sum(original);
        Assert.assertEquals(30, sum);
    }
}
