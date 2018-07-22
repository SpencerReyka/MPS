package com.pipeline.instructions;

import com.pipeline.util.Register;

public class Instruction {
    private int instr;
    private String type;
    private int rs;
    private int rt;
    private int rd;
    private int tarReg;
    private int immediate;
    private int branchTar;


    public int getInstr() {
        return instr;
    }

    public void setInstr(int instr) {
        this.instr = instr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getTarReg() {
        return tarReg;
    }

    public void setTarReg(int tarReg) {
        this.tarReg = tarReg;
    }

    public int getImmediate() {
        return immediate;
    }

    public void setImmediate(int immediate) {
        this.immediate = immediate;
    }

    public int getBranchTar() {
        return branchTar;
    }

    public void setBranchTar(int branchTar) {
        this.branchTar = branchTar;
    }

    public void deepCopyFrom(Instruction instrToCopyFrom) {
        instr = instrToCopyFrom.getInstr();
        type = instrToCopyFrom.getType();
        rs = instrToCopyFrom.getRs();
        rt = instrToCopyFrom.getRs();
        rd = instrToCopyFrom.getRd();
        tarReg = instrToCopyFrom.getTarReg();
        immediate = instrToCopyFrom.getImmediate();
        branchTar = instrToCopyFrom.getImmediate();
    }
}
