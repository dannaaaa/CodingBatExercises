package com.spartagloal.CodingBatExercises;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
}
