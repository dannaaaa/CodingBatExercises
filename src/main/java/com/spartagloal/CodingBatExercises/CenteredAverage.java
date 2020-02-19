package com.spartagloal.CodingBatExercises;

public class CenteredAverage {

    public int centeredAverage(int[] nums) {

        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int total = (sum - min - max) / (nums.length - 2);
        System.out.println(total);

        return total;
    }
}
