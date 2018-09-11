package com.pipeline.instructions.i_type_instruction_tests;

import com.pipeline.instructions.Instruction;
import org.junit.Assert;
import org.junit.Test;

public class LWInstructionTest {

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

    }

    /**
     * Testing L Type with format:
     * opcode: 35
     * rs:     16
     * rt:     8
     * address:4
     * <p>
     * translation: lw $, 4($)
     */
    @Test
    public void TestLoadWordParsing2() {
        Instruction sut = new Instruction(-1912078332);


        Assert.assertEquals(sut.getOpCode(), 35);
        Assert.assertEquals(sut.getRs(), 16);
        Assert.assertEquals(sut.getRt(), 8);
        Assert.assertEquals(sut.getImmediate(), 4);

    }
}
