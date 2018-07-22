package com.pipeline.instructions;

import org.junit.Assert;
import org.junit.Test;

public class InstructionTest {

    @Test
    public void TestEmptyParse(){

    }

    @Test
    public void TestDeepCopy(){
        Instruction instrToCopy = new Instruction();
        Instruction instrToChange = new Instruction();

        instrToChange.setBranchTar(10);
        instrToChange.setInstr(1223);
        instrToChange.setImmediate(23);
        instrToChange.setRd(3423);
        instrToChange.setRs(2342);
        instrToChange.setRt(3444);
        instrToChange.setType("R");

        Assert.assertNotEquals(instrToCopy.getBranchTar(), instrToChange.getBranchTar());
        Assert.assertNotEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertNotEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertNotEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertNotEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertNotEquals(instrToCopy.getRs(), instrToChange.getRs());
        Assert.assertNotEquals(instrToCopy.getType(), instrToChange.getType());

        instrToChange.deepCopyFrom(instrToCopy);

        Assert.assertEquals(instrToCopy.getBranchTar(), instrToChange.getBranchTar());
        Assert.assertEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertEquals(instrToCopy.getRs(), instrToChange.getRs());
        Assert.assertEquals(instrToCopy.getType(), instrToChange.getType());
    }
}
