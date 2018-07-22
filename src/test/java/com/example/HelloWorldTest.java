package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class HelloWorldTest {

    @Test
    @DisplayName("Testing Hello World!")
    public void TestHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals(helloWorld.printHello(),"Hello, World!");
    }
}
