package com.pipeline.instructions.r_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class AddInstuctionTest {

    /**
     * Testing R Type with format:
     * opcode: 0
     * rs:     8
     * rt:     9
     * rd:     10
     * shamt:  0
     * funct:  32
     * <p>
     * translation: add $10, $8, $9
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
     * opcode: 0
     * rs:     3
     * rt:     2
     * rd:     4
     * shamt:  0
     * funct:  32
     * <p>
     * translation: add $4, $3, $2
     */
    @Test
    public void TestRTypeParsing2() {
        Instruction sut = new Instruction(6430752);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 3);
        Assert.assertEquals(sut.getRt(), 2);
        Assert.assertEquals(sut.getRd(), 4);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }

    /**
     * Testing R Type with format:
     * opcode: 0
     * rs:     3
     * rt:     7
     * rd:     4
     * shamt:  0
     * funct:  32
     * <p>
     * translation: add $a0, $a1, $a3
     */
    @Test
    public void TestRTypeParsing3() {
        Instruction sut = new Instruction(0x00A72020);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 5);
        Assert.assertEquals(sut.getRt(), 7);
        Assert.assertEquals(sut.getRd(), 4);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }

    /**
     * Testing R Type with format:
     * opcode: 0
     * rs:     6
     * rt:     16
     * rd:     9
     * shamt:  0
     * funct:  32
     * <p>
     * translation: add $t1, $a2, $s0
     */
    @Test
    public void TestRTypeParsing4() {
        Instruction sut = new Instruction(0x00D04820);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 6);
        Assert.assertEquals(sut.getRt(), 16);
        Assert.assertEquals(sut.getRd(), 9);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }

    /**
     * Testing R Type with format:
     * opcode: 0
     * rs:     15
     * rt:     19
     * rd:     2
     * shamt:  0
     * funct:  32
     * <p>
     * translation: add $4, $3, $2
     */
    @Test
    public void TestRTypeParsing5() {
        Instruction sut = new Instruction(0x01F31020);

        Assert.assertEquals(sut.getOpCode(), 0);
        Assert.assertEquals(sut.getRs(), 15);
        Assert.assertEquals(sut.getRt(), 19);
        Assert.assertEquals(sut.getRd(), 2);
        Assert.assertEquals(sut.getShamt(), 0);
        Assert.assertEquals(sut.getFunct(), 32);

    }


}
