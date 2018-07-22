package com.pipeline;

import org.junit.Assert;
import org.junit.Test;

public class SimulatorTest {

    Simulator SUT = new Simulator();

    @Test
    public void TestLengthOfMemory() {
        Assert.assertEquals(SUT.getDataArray().length, 32);
    }

    @Test
    public void TestLengthOfRegister() {
        Assert.assertEquals(SUT.getRegArray().length, 32);
    }

}
