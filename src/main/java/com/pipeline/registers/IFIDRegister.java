package com.pipeline.registers;

import com.pipeline.instructions.Instruction;

public class IFIDRegister {

    private Instruction instr;
    private int pcPlus4;


    public Instruction getInstr() {
        return instr;
    }

    public void setInstr(Instruction instr) {
        this.instr = instr;
    }

    public int getPcPlus4() {
        return pcPlus4;
    }

    public void setPcPlus4(int pcPlus4) {
        this.pcPlus4 = pcPlus4;
    }

    public void deepCopyFrom(IFIDRegister regToCopyFrom) {

    }
}
