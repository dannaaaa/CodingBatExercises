package com.spartagloal.CodingBatExercises;

public class BigDiff {

    public int bigDiff(int[] nums) {
        int bigNum = nums[0];
        int smallNum = nums[0];

        for(int i = 0; i < nums.length;i++){
            bigNum = Math.max( bigNum, nums[i]);
            smallNum = Math.min(smallNum, nums[i]);
        }

        int sum = bigNum - smallNum;
        System.out.println(sum);
        return sum;
    }

}
