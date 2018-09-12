package com.pipeline.instructions.r_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class AndInstructionTest {

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     2
     * rt:     11
     * rd:     16
     * shamt:  0
     * funct:  36
     * <p>
     * translation: and $s0, $v0, $t3
     */
    @Test
    public void TestAndParsing1() {
        Instruction sut = new Instruction(0x004B8024);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(2, sut.getRs());
        Assert.assertEquals(11, sut.getRt());
        Assert.assertEquals(16, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(36, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     11
     * rt:     31
     * rd:     12
     * shamt:  0
     * funct:  36
     * <p>
     * translation: and $t4, $t3, $ra
     */
    @Test
    public void TestAndTypeParsing2() {
        Instruction sut = new Instruction(0x017F6024);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(11, sut.getRs());
        Assert.assertEquals(31, sut.getRt());
        Assert.assertEquals(12, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(36, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     9
     * rt:     2
     * rd:     19
     * shamt:  0
     * funct:  36
     * <p>
     * translation: and $s3, $t1, $v0
     */
    @Test
    public void TestAndTypeParsing3() {
        Instruction sut = new Instruction(0x01229824);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(9, sut.getRs());
        Assert.assertEquals(2, sut.getRt());
        Assert.assertEquals(19, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(36, sut.getFunct());

    }

    /**
     * Testing R Type instruction with format:
     * opcode: 0
     * rs:     4
     * rt:     5
     * rd:     2
     * shamt:  0
     * funct:  34
     * <p>
     * translation: and $v0, $a0, $a1
     */
    @Test
    public void TestAndTypeParsing4() {
        Instruction sut = new Instruction(0x00851024);

        Assert.assertEquals(0, sut.getOpCode());
        Assert.assertEquals(4, sut.getRs());
        Assert.assertEquals(5, sut.getRt());
        Assert.assertEquals(2, sut.getRd());
        Assert.assertEquals(0, sut.getShamt());
        Assert.assertEquals(36, sut.getFunct());

    }
}
