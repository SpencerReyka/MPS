package com.pipeline.instructions.r_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class SubInstructionTest {
    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     8
     * rt:     9
     * rd:     10
     * shamt:  0
     * funct:  34
     * <p>
     * translation: sub $10, $8, $9
     */
    @Test
    public void TestRTypeParsing1() {
        Instruction sut = new Instruction(17387554);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(8, sut.getRs());
        Assert.assertEquals(9, sut.getRt());
        Assert.assertEquals(10, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(34, sut.getFunct());

    }
    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     10
     * rt:     4
     * rd:     9
     * shamt:  0
     * funct:  34
     * <p>
     * translation: sub $t1, $t2, $a0
     */
    @Test
    public void TestRTypeParsing2() {
        Instruction sut = new Instruction(0x01444822);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(10, sut.getRs());
        Assert.assertEquals(4, sut.getRt());
        Assert.assertEquals(9, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(34, sut.getFunct());

    }
    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     24
     * rt:     25
     * rd:     4
     * shamt:  0
     * funct:  34
     * <p>
     * translation: sub $10, $8, $9
     */
    @Test
    public void TestRTypeParsing3() {
        Instruction sut = new Instruction(0x03192022);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(24, sut.getRs());
        Assert.assertEquals(25, sut.getRt());
        Assert.assertEquals(4, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(34, sut.getFunct());

    }
    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     6
     * rt:     0
     * rd:     4
     * shamt:  0
     * funct:  34
     * <p>
     * translation: sub $10, $8, $9
     */
    @Test
    public void TestRTypeParsing4() {
        Instruction sut = new Instruction(0x00C02022);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(6, sut.getRs());
        Assert.assertEquals(0, sut.getRt());
        Assert.assertEquals(4, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(34, sut.getFunct());

    }
}
