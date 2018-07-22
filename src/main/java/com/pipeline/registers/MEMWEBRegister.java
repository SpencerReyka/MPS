package com.pipeline.registers;

import com.pipeline.instructions.Instruction;

public class MEMWEBRegister {

    private Instruction instruction;
    private int writeDataFromMemory; //data read from memory for load word
    private int writeDataFromALU; //data forwarded from the previous stage, the ALU result
    private int writeRegister; //the target register, rt or rd, depending on instruction


    public Instruction getInstruction() {
        return instruction;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public int getWriteDataFromMemory() {
        return writeDataFromMemory;
    }

    public void setWriteDataFromMemory(int writeDataFromMemory) {
        this.writeDataFromMemory = writeDataFromMemory;
    }

    public int getWriteDataFromALU() {
        return writeDataFromALU;
    }

    public void setWriteDataFromALU(int writeDataFromALU) {
        this.writeDataFromALU = writeDataFromALU;
    }

    public int getWriteRegister() {
        return writeRegister;
    }

    public void setWriteRegister(int writeRegister) {
        this.writeRegister = writeRegister;
    }

    public void deepCopyFrom(MEMWEBRegister regToCopyFrom) {

    }
}
