package com.spartagloal.CodingBatExercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ExercisesTest
{

    @Test
    public void shouldCountEvens() {

        CountingEvens countingEvens = new CountingEvens();
        Assert.assertEquals(3, countingEvens.countEvens(new int[]{2, 5, 7, 9, 8, 6}));
    }

    @Test
    public void shouldGetBigDiff () {
        BigDiff bigDiff = new BigDiff();
        Assert.assertEquals(7, bigDiff.bigDiff(new int[] {10, 3, 5, 6}));
    }

    @Test
    public void shouldGetCenteredAverage(){
        CenteredAverage centeredAverage = new CenteredAverage();
        Assert.assertEquals(3, centeredAverage.centeredAverage(new int[] {1, 2, 3, 4, 100}));
    }

    @Test
    public void shouldGetSum13(){
        Sum13 sum13 = new Sum13();
        Assert.assertEquals(6, sum13.sum13(new int[]{1, 2, 2, 1}));
        Assert.assertEquals(6, sum13.sum13(new int[]{1, 2, 2, 1, 13}));
    }

    @Test
    public void shouldGetCountXX (){
        CountXX countXX = new CountXX();
        Assert.assertEquals(1, countXX.countXX("fixxations"));
    }

    @Test
    public void shouldGetCountYZ (){
        CountYZ countYZ = new CountYZ();
        Assert.assertEquals(1, countYZ.countYZ("zoey"));
        Assert.assertEquals(1, countYZ.countYZ("lovely"));
        Assert.assertEquals(1, countYZ.countYZ("amazzingyy"));
    }

    @Test
    public void shouldGetLast2 (){
        Last2 last2 = new Last2();
        Assert.assertEquals(1, last2.last2("hixxxhi"));
    }

    @Test
    public void shouldGetStringTimes(){
        StringTimes stringTimes = new StringTimes();
        Assert.assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
    }

    @Test
    public void shouldGetArrayCount9 (){
        ArrayCount9 arrayCount9 = new ArrayCount9();
        Assert.assertEquals(3, arrayCount9.arrayCount9(new int[]{2, 9, 4, 99, 23, 9, 1999, 8, 9}));
    }

    @Test
    public void shouldGetArrayFront9(){
        ArrayFront9 arrayFront9 = new ArrayFront9();
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{1,9,3,9}));
    }
}
