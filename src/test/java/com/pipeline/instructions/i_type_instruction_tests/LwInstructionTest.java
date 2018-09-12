package com.pipeline.instructions.i_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class LwInstructionTest {

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     6
     * rt:     5
     * address:8
     * <p>
     * translation: lw $5, 8($6)
     */
    @Test
    public void TestLoadWordParsing1() {
        Instruction sut = new Instruction(-1933246456);

        Assert.assertEquals(sut.getOpCode(), 35);
        Assert.assertEquals(sut.getRs(), 6);
        Assert.assertEquals(sut.getRt(), 5);
        Assert.assertEquals(sut.getImmediate(), 8);

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     4
     * rt:     9
     * address:4
     * <p>
     * translation: lw $t1, 4($a0)
     */
    @Test
    public void TestLoadWordParsing2() {
        Instruction sut = new Instruction(0x8C890004);


        Assert.assertEquals(35, sut.getOpCode());
        Assert.assertEquals(4, sut.getRs());
        Assert.assertEquals(9, sut.getRt());
        Assert.assertEquals(4, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     16
     * rt:     8
     * address:1092
     * <p>
     * translation: lw $s4, 1092($v0)
     */
    @Test
    public void TestLoadWordParsing3() {
        Instruction sut = new Instruction(0x8C540444);


        Assert.assertEquals(35, sut.getOpCode());
        Assert.assertEquals(2, sut.getRs());
        Assert.assertEquals(20, sut.getRt());
        Assert.assertEquals(1092, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     22
     * rt:     14
     * address:43828
     * <p>
     * translation: lw $t6, 43828($v0)
     */
    @Test
    public void TestLoadWordParsing4() {
        Instruction sut = new Instruction(0x8ECEAB34);


        Assert.assertEquals(35, sut.getOpCode());
        Assert.assertEquals(22, sut.getRs());
        Assert.assertEquals(14, sut.getRt());
        Assert.assertEquals(43828, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Tests if the LW address (immediate) is a multiple of 4
     *
     * @return boolean if the address is a multiple of 4
     */
    private boolean isMultipleOf4(int immed) {
        return immed % 4 == 0;
    }
}
