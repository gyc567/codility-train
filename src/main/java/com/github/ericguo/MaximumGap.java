package com.github.ericguo;

import java.util.*;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 1/17/2017.
 * Given an unsorted array, find the
 * maximum difference between the successive elements in its sorted form.

 Try to solve it in linear time/space.

 Return 0 if the array contains less than 2 elements.

 You may assume all elements in the array are
 non-negative integers and fit in the 32-bit signed integer range.
 */
public class MaximumGap {

    public static int maximumGap(int[] nums) {


        Arrays.sort(nums);

        int mxCap=0;
        for (int i = 0; i < nums.length-1; i++) {
           int cap=Math.abs(nums[i]-nums[i+1]);
           if(mxCap<cap)
           {
               mxCap=cap;
           }

        }
        return mxCap;
    }
}
