package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void sum() {
        MyCalculator calculator = new MyCalculator();
        int result =calculator.sum(15,10);
        assertEquals(25,result);
    }
    @Test
    public void Add(){
        assertEquals(10,MyCalculator.sum(5,5));
    }

    @Test
    public void sub() {
        MyCalculator calculator = new MyCalculator();
        int result =calculator.sub(15,10);
        assertEquals(5,result);
    }

    @Test
    public void mul() {
        MyCalculator calculator = new MyCalculator();
        int result =calculator.mul(15,10);
        assertEquals(150,result);
    }

    @Test
    public void div() {
        MyCalculator calculator = new MyCalculator();
        int result =calculator.div(15,10);
        assertEquals(1.0,result,0.0);

    }
    @Test
    public void arrayInsert() {
       Integer[]expected={1,2,3};
       Integer[]actual={1,2,3};
       assertArrayEquals(expected,MyCalculator.ArrayInsert(actual));
    }

}