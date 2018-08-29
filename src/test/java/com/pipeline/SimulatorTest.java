package com.pipeline;

import org.junit.Assert;
import org.junit.Test;

public class SimulatorTest {

    private Simulator SUT = new Simulator();

    @Test
    public void TestInstrArrayAtInstantiation(){
        Simulator sim = new Simulator();
        Assert.assertNull(sim.getInstrArray());
    }

    @Test
    public void TestBranchPredArrayAtInstantiation(){
        Simulator sim = new Simulator();
        Assert.assertNull(sim.getBranchPredArray());
    }
    @Test
    public void TestLengthOfMemoryAtInstantiation() {
        Assert.assertEquals(SUT.getDataArray().length, 32);
    }

    @Test
    public void TestLengthOfRegisterAtInstantiation() {
        Assert.assertEquals(SUT.getRegArray().length, 32);
    }

}
