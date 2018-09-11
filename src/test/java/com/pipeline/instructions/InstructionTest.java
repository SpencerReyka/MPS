package com.pipeline.instructions;

import org.junit.Assert;
import org.junit.Test;
//TODO add full documentation

//TODO just start at R instru maybe
//TODO make list of simple instructions to start at: add sub lw sw addi ori subi
public class InstructionTest {

    /**
     * Testing Zero with format:
     * opcode: 0
     * rs:     0
     * rt:     0
     * rd:     0
     * shamt:  0
     * funct:  0
     * <p>
     * translation: Zero Test, no real translation
     */
    @Test
    public void SimpleParseOf0() {
        Instruction sut = new Instruction(0);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 0);
        Assert.assertEquals(sut.getRt(), 0);
        Assert.assertEquals(sut.getRd(), 0);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 0);

    }

    //TODO ADD rest of deep copy checking
    @Test
    public void TestDeepCopy() {
        Instruction instrToCopy = new Instruction(0);
        Instruction instrToChange = new Instruction(0xFFFFFFFF);

        Assert.assertNotEquals(instrToCopy.getAddress(), instrToChange.getAddress());
        Assert.assertNotEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertNotEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertNotEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertNotEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertNotEquals(instrToCopy.getRs(), instrToChange.getRs());

        instrToChange.deepCopyFrom(instrToCopy);

        Assert.assertEquals(instrToCopy.getAddress(), instrToChange.getAddress());
        Assert.assertEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertEquals(instrToCopy.getRs(), instrToChange.getRs());
    }

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     2
     * rt:     7
     * address:4
     * <p>
     * translation: bne $2, 4($7)
     */
    @Test
    public void TestBranchNotEqual1() {
        Instruction sut = new Instruction(273088516);

        Assert.assertEquals(sut.getOpCode(), 4);
        Assert.assertEquals(sut.getRs(), 2);
        Assert.assertEquals(sut.getRt(), 7);
        Assert.assertEquals(sut.getImmediate(), 4);

    }
}
