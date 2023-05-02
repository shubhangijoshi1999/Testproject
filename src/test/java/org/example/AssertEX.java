package org.example;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AssertEX {
    @Test
    public void assequ(){
        String s1="Shubhangi";
        String s2="Shubhangi";
        assertEquals(s1,s2);
    }
    @Test
    public void assArray(){
        int [] num={1,2,3};
        int [] num1=new  int[3];
        num1[0]=1;
        num1[1]=2;
        num1[2]=3;
        assertArrayEquals(num,num1);
        List languages = new ArrayList<>();
        List moreLanguages = new ArrayList<>();
        assertNotSame(languages,moreLanguages);
    }
    @Test
    public void assFalse(){
        String s="java";
        assertTrue(s.contains("j"));
    }
}
