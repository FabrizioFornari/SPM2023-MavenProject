package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class MyClassTest {

    @Test
    //@Disabled
    public void testMultiply() {
        MyClass tester = new MyClass();
        assertEquals(50, tester.multiply(10, 5));
    }
}