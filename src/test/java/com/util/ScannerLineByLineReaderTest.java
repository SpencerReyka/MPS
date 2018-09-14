package com.util;

import com.pipeline.Simulator;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.fail;

public class ScannerLineByLineReaderTest {

    @Test
    public void ParseTestFile1() {
        LineByLineReader sut = new ScannerLineByLineReader();
        try {
            Assert.assertEquals(sut.ParseFile(""), new ArrayList<String>().add(""));
        } catch(FileNotFoundException e){
            fail("Did not expect a File Not Found Exception: " + e);
        }
    }

    @Test
    public void ParseTestFile2() {
        LineByLineReader sut = new ScannerLineByLineReader();
        try {
            Assert.assertEquals(sut.ParseFile(""), new ArrayList<String>().add(""));
        } catch(FileNotFoundException e){
            fail("Did not expect a File Not Found Exception: " + e);
        }
    }

    @Test
    public void ParseTestFile3() {
        LineByLineReader sut = new ScannerLineByLineReader();
        try {
            Assert.assertEquals(sut.ParseFile(""), new ArrayList<String>().add(""));
        } catch(FileNotFoundException e){
            fail("Did not expect a File Not Found Exception: " + e);
        }
    }

    @Test
    public void FileNotFoundError() {
        LineByLineReader sut = new ScannerLineByLineReader();
        try {
            Assert.assertEquals(sut.ParseFile(""), new ArrayList<String>().add(""));
        } catch(FileNotFoundException e){
            fail("Did not expect a File Not Found Exception: " + e);
        }
    }

    @Test
    public void OtherError() {
        LineByLineReader sut = new ScannerLineByLineReader();
        try {
            Assert.assertEquals(sut.ParseFile(""), new ArrayList<String>().add(""));
        } catch(FileNotFoundException e){
            fail("Did not expect a File Not Found Exception: " + e);
        }
    }
}
