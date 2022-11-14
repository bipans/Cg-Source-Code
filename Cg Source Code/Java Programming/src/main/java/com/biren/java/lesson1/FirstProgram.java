package com.biren.java.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstProgram {
    @Test
    public void shouldReturnHelloWorld(){
        Person biren=new Person();
        assertEquals("hello world ",biren.helloWorld());


    }
}
