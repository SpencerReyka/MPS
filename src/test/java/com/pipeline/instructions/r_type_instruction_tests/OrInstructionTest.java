package com.pipeline.instructions.r_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class OrInstructionTest {

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     10
     * rt:     11
     * rd:     9
     * shamt:  0
     * funct:  37
     * <p>
     * translation: or $t1, $t2, $t3
     */
    @Test
    public void TestOrParsing1() {
        Instruction sut = new Instruction(0x014B4825);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(10, sut.getRs());
        Assert.assertEquals(11, sut.getRt());
        Assert.assertEquals(9, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(37, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     18
     * rt:     22
     * rd:     16
     * shamt:  0
     * funct:  37
     * <p>
     * translation: or $s0, $s2, $s6
     */
    @Test
    public void TestOrParsing2() {
        Instruction sut = new Instruction(0x02568025);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(18, sut.getRs());
        Assert.assertEquals(22, sut.getRt());
        Assert.assertEquals(16, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(37, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     17
     * rt:     18
     * rd:     2
     * shamt:  0
     * funct:  37
     * <p>
     * translation: or $v0, $s1, $s2
     */
    @Test
    public void TestOrParsing3() {
        Instruction sut = new Instruction(0x02321025);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(17, sut.getRs());
        Assert.assertEquals(18, sut.getRt());
        Assert.assertEquals(2, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(37, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     23
     * rt:     15
     * rd:     2
     * shamt:  0
     * funct:  37
     * <p>
     * translation: or $v0, $s7, $t7
     */
    @Test
    public void TestOrParsing4() {
        Instruction sut = new Instruction(0x02EF1025);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(23, sut.getRs());
        Assert.assertEquals(15, sut.getRt());
        Assert.assertEquals(2, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(37, sut.getFunct());

    }
}
