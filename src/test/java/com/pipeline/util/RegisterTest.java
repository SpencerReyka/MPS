package com.pipeline.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RegisterTest {

    @Test
    public void TestRegisterCreation() {
        Register reg = new Register();
        Assert.assertEquals(reg.getValue(), 0);

    }

    @Test
    public void TestRegisterChange() {
        int randomNum = new Random().nextInt((10 - 1) + 1) + 1;
        Register reg = new Register();
        reg.setValue(randomNum);
        Assert.assertEquals(reg.getValue(), randomNum);
    }

}
