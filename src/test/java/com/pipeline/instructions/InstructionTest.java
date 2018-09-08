package com.pipeline.instructions;

import org.junit.Assert;
import org.junit.Test;
//TODO add full documentation
public class InstructionTest {

    /**
     * Testing Zero with format:
     *  opcode: 0
     *  rs:     0
     *  rt:     0
     *  rd:     0
     *  shamt:  0
     *  funct:  0
     *
     *  translation: Zero Test, no real translation
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

        Assert.assertNotEquals(instrToCopy.getBranchTar(), instrToChange.getBranchTar());
        Assert.assertNotEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertNotEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertNotEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertNotEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertNotEquals(instrToCopy.getRs(), instrToChange.getRs());

        instrToChange.deepCopyFrom(instrToCopy);

        Assert.assertEquals(instrToCopy.getBranchTar(), instrToChange.getBranchTar());
        Assert.assertEquals(instrToCopy.getInstr(), instrToChange.getInstr());
        Assert.assertEquals(instrToCopy.getImmediate(), instrToChange.getImmediate());
        Assert.assertEquals(instrToCopy.getRt(), instrToChange.getRt());
        Assert.assertEquals(instrToCopy.getRd(), instrToChange.getRd());
        Assert.assertEquals(instrToCopy.getRs(), instrToChange.getRs());
    }

    /**
     * Testing R Type with format:
     *  opcode: 0
     *  rs:     8
     *  rt:     9
     *  rd:     10
     *  shamt:  0
     *  funct:  32
     *
     *  translation: add $10, $8, $9
     */
    @Test
    public void TestRTypeParsing1() {
        Instruction sut = new Instruction(17387552);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 8);
        Assert.assertEquals(sut.getRt(), 9);
        Assert.assertEquals(sut.getRd(), 10);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }

    /**
     * Testing R Type with format:
     *  opcode: 0
     *  rs:     8
     *  rt:     9
     *  rd:     10
     *  shamt:  0
     *  funct:  34
     *
     *  translation: sub $10, $8, $9
     */
    @Test
    public void TestRTypeParsing2() {
        Instruction sut = new Instruction(17387554);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 8);
        Assert.assertEquals(sut.getRt(), 9);
        Assert.assertEquals(sut.getRd(), 10);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 34);

    }

    /**
     * Testing R Type with format:
     *  opcode: 0
     *  rs:     3
     *  rt:     2
     *  rd:     4
     *  shamt:  0
     *  funct:  32
     *
     *  translation: add $4, $3, $2
     */
    @Test
    public void TestRTypeParsing3() {
        Instruction sut = new Instruction(6430752);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 3);
        Assert.assertEquals(sut.getRt(), 2);
        Assert.assertEquals(sut.getRd(), 4);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }
}
