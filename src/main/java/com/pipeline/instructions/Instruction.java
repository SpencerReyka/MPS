package com.pipeline.instructions;

import com.pipeline.util.Register;

public class Instruction {
    private int instr;
    private String type;
    private int opCode;
    private int rs;
    private int rt;
    private int rd;
    private int tarReg;
    private int shamt;
    private int funct;
    private int immediate;
    private int branchTar;

    public Instruction(int signedint) {
        this.instr = signedint;
        this.opCode = (signedint >> 26);
        this.rs = (signedint >> 21) & 0x1F;
        this.rt = (signedint >> 16) & 0x1F;
        this.rd = (signedint >> 11) & 0x1F;
        this.shamt = (signedint >> 6) & 0x1F;
        this.funct = (signedint) & 0x3F;
        this.immediate = (signedint) & 0xFFFF;
        this.branchTar = (signedint) & 0x3FFFFFF;
    }

    public void deepCopyFrom(Instruction instrToCopyFrom) {
        instr = instrToCopyFrom.getInstr();
        type = instrToCopyFrom.getType();
        opCode = instrToCopyFrom.getOpCode();
        rs = instrToCopyFrom.getRs();
        rt = instrToCopyFrom.getRs();
        rd = instrToCopyFrom.getRd();
        tarReg = instrToCopyFrom.getTarReg();
        shamt = instrToCopyFrom.getShamt();
        funct = instrToCopyFrom.getFunct();
        immediate = instrToCopyFrom.getImmediate();
        branchTar = instrToCopyFrom.getImmediate();
    }

    //TODO Put these in order

    public int getInstr() {
        return instr;
    }

    public String getType() {
        return type;
    }

    public int getRs() {
        return rs;
    }

    public int getRt() {
        return rt;
    }

    public int getRd() {
        return rd;
    }

    public int getTarReg() {
        return tarReg;
    }

    public int getImmediate() {
        return immediate;
    }

    public int getBranchTar() {
        return branchTar;
    }

    public int getOpCode() {
        return opCode;
    }

    public int getShamt() {
        return shamt;
    }

    public int getFunct() {
        return funct;
    }
}
