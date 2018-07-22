package com.pipeline.registers;

import com.pipeline.instructions.Instruction;

public class IDEXRegister {

    private Instruction instr;
    private int pcPlus4;
    private int branchTar;
    private int rs, rt, rd;
    private int readData1, readData2;
    private int immediate;


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

    public int getBranchTar() {
        return branchTar;
    }

    public void setBranchTar(int branchTar) {
        this.branchTar = branchTar;
    }

    public int getRs() {
        return rs;
    }

    public void setRs(int rs) {
        this.rs = rs;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public int getReadData1() {
        return readData1;
    }

    public void setReadData1(int readData1) {
        this.readData1 = readData1;
    }

    public int getReadData2() {
        return readData2;
    }

    public void setReadData2(int readData2) {
        this.readData2 = readData2;
    }

    public int getImmediate() {
        return immediate;
    }

    public void setImmediate(int immediate) {
        this.immediate = immediate;
    }

    public void deepCopyFrom(IDEXRegister regToCopyFrom) {

    }
}
