package com.eldin.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void sum_with3Numbers() {
        int result= myMath.sum(new int[]{1,2,3});
        assertEquals(6, result);
        System.out.println(result);

    }

    @Test
    public void sum_with1Numbers() {
        int result= myMath.sum(new int[]{3});
        assertEquals(3, result);
        System.out.println(result);

    }


}