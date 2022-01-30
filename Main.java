package com.max.idea;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] nums;
        nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;

        System.out.println(nums[nums.length-3]+nums[nums.length-5]);
    }
}