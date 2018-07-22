package com.pipeline.registers;

import com.pipeline.instructions.Instruction;

public class EXMEMRegister {

    private Instruction instr;
    private int aluResult;
    private int writeData; //the data in rt register for store word
    private int writeRegister; //the target register, rt or rd, depending on instruction


    public Instruction getInstr() {
        return instr;
    }

    public void setInstr(Instruction instr) {
        this.instr = instr;
    }

    public int getAluResult() {
        return aluResult;
    }

    public void setAluResult(int aluResult) {
        this.aluResult = aluResult;
    }

    public int getWriteData() {
        return writeData;
    }

    public void setWriteData(int writeData) {
        this.writeData = writeData;
    }

    public int getWriteRegister() {
        return writeRegister;
    }

    public void setWriteRegister(int writeRegister) {
        this.writeRegister = writeRegister;
    }

    public void deepCopyFrom(EXMEMRegister regToCopyFrom) {
        this.instr.deepCopyFrom(regToCopyFrom.instr);
        this.aluResult = regToCopyFrom.getAluResult();
        this.writeData = regToCopyFrom.getWriteData();
        this.writeRegister = regToCopyFrom.getWriteData();
    }
}
