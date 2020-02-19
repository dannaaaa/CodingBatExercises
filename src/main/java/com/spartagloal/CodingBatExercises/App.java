package com.spartagloal.CodingBatExercises;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        System.out.println("There are " + arrayCount9.arrayCount9(new int[] {2,8,9,3,99,9}) + " nines in the array");

        ArrayFront9 arrayFront9 = new ArrayFront9();
        System.out.println(arrayFront9.arrayFront9(new int[] {1, 2, 9, 4}));

        BigDiff bigDiff = new BigDiff();
        System.out.println(bigDiff.bigDiff(new int [] {1, 3, 5,8}));
    }



}
