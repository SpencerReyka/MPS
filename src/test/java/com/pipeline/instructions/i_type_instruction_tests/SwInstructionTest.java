package com.pipeline.instructions.i_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class SwInstructionTest
{
    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     12
     * rt:     2
     * address:360
     * <p>
     * translation: lw $v0, 360($t4)
     */
    @Test
    public void TestLoadWordParsing1() {
        Instruction sut = new Instruction(0xAD820168);


        Assert.assertEquals(43, sut.getOpCode());
        Assert.assertEquals(12, sut.getRs());
        Assert.assertEquals(2, sut.getRt());
        Assert.assertEquals(360, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 43
     * rs:     0
     * rt:     24
     * address:3900
     * <p>
     * translation: lw $t8, 3900($zero)
     */
    @Test
    public void TestLoadWordParsing2() {
        Instruction sut = new Instruction(0xAC180F3C);


        Assert.assertEquals(43, sut.getOpCode());
        Assert.assertEquals(0, sut.getRs());
        Assert.assertEquals(24, sut.getRt());
        Assert.assertEquals(3900, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 43
     * rs:     3
     * rt:     19
     * address:3900
     * <p>
     * translation: lw $s3, 65532($v1)
     */
    @Test
    public void TestLoadWordParsing3() {
        Instruction sut = new Instruction(0xAC73FFFC);


        Assert.assertEquals(43, sut.getOpCode());
        Assert.assertEquals(3, sut.getRs());
        Assert.assertEquals(19, sut.getRt());
        Assert.assertEquals(65532, sut.getImmediate());

        Assert.assertTrue(isMultipleOf4(sut.getImmediate()));
    }

    /**
     * Testing L Type with format:
     * opcode: 43
     * rs:     23
     * rt:     25
     * address:3844
     * <p>
     * translation: lw $t8, 3844($zero)
     */
    @Test
    public void TestLoadWordParsing4() {
        Instruction sut = new Instruction(0xAEF90F04);


        Assert.assertEquals(43, sut.getOpCode());
        Assert.assertEquals(23, sut.getRs());
        Assert.assertEquals(25, sut.getRt());
        Assert.assertEquals(3844, sut.getImmediate());

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
