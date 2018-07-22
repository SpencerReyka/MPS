package com.pipeline;

import com.pipeline.registers.EXMEMRegister;
import com.pipeline.registers.IDEXRegister;
import com.pipeline.registers.IFIDRegister;
import com.pipeline.registers.MEMWEBRegister;

public class State {
    private IFIDRegister ifidReg;
    private IDEXRegister idexReg;
    private EXMEMRegister exmemReg;
    private MEMWEBRegister memwebReg;

    public State(){
        ifidReg = new IFIDRegister();
        idexReg = new IDEXRegister();
        exmemReg = new EXMEMRegister();
        memwebReg = new MEMWEBRegister();
    }

    public State(IFIDRegister ifidReg, IDEXRegister idexReg, EXMEMRegister exmemReg, MEMWEBRegister memwebReg){
        this.ifidReg = ifidReg;
        this.idexReg = idexReg;
        this.exmemReg = exmemReg;
        this.memwebReg = memwebReg;
    }

    public void DeepCopyFrom(State stateToCopy){
        this.ifidReg.deepCopyFrom(stateToCopy.ifidReg);
        this.idexReg.deepCopyFrom(stateToCopy.idexReg);
        this.exmemReg.deepCopyFrom(stateToCopy.exmemReg);
        this.memwebReg.deepCopyFrom(stateToCopy.memwebReg);

    }

}
