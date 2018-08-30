package com.pipeline.instructions;

import com.pipeline.util.LineByLineReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InstructionMemoryDevice {

    private List<Instruction> instructions;

    public boolean ReadAndParseInstructions(String file) {

        instructions = new ArrayList<>();

        try {

            LineByLineReader.readFile(file).forEach(line -> {
                try {
                    instructions.add(new Instruction(Integer.parseInt(line)));
                } catch (NumberFormatException e) {
                    System.out.println("Ran into a non integer line");
                }
            });

        } catch (IOException e) {
            System.out.println("Ran into problem with opening file and reading");
            return false;
        }

        return true;
    }
//handle taking in instructions, parsing them
//handles instruction fetching by taking in PC and spitting out the instruction
//test that it works


}
