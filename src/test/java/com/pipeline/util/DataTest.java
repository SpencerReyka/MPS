package com.pipeline.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DataTest {

    @Test
    public void TestDataCreation() {
        Data data = new Data();
        Assert.assertEquals(data.getValue(), 0);

    }

    @Test
    public void TestRegisterChange() {
        int randomNum = new Random().nextInt((10 - 1) + 1) + 1;
        Data data = new Data();
        data.setValue(randomNum);
        Assert.assertEquals(data.getValue(), randomNum);
    }

}
