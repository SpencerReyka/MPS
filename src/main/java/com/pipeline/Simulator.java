package com.pipeline;

import com.pipeline.util.Data;
import com.pipeline.util.Register;

import java.util.function.Supplier;

public class Simulator {

    private static final int INSTR_NUM = 100;
    private static final int REG_NUM = 32;
    private static final int DATA_NUM = 32;
    private static final int BRANCH_PRED_NUM = 100;


    private Register[] regArray;
    private Data[] dataArray;

    /**
     * Constructor that handles setting up the pipeline and the registers and instructions
     */
    public Simulator(){
        //set up register and memory array
        regArray = setUpArray(new Register[REG_NUM], Register::new);
        dataArray = setUpArray(new Data[DATA_NUM], Data::new);





    }


    /**
     * Constructor that handles setting up the pipeline and the registers and instructions
     *
     * @param array array to fill with brand new items
     * @param constructor constructor method passed in
     */
    private static <T> T[] setUpArray (T[] array, Supplier<T> constructor){
        for(int i = 0; i < array.length; ++i){
            array[i] = constructor.get();
        }
        return array;
    }

    public Register[] getRegArray() {
        return regArray;
    }

    public Data[] getDataArray() {
        return dataArray;
    }
}
