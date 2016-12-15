package com.github.ericguo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/7/2016.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        int[] rt=new int[2];

        for (int i = 0, j =length-1 ; i < j; i++,j--) {

            while (nums[i]>target)
            {
                i++;
            }
            while (nums[j]>target)
            {
                j--;
            }
            int sum=nums[i]+nums[j];

            if(Math.abs(sum)==Math.abs(target))
            {
                rt[0]=i;
                rt[1]=j;
            }else{
                j--;
            }
        }

        return rt;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i );
        }
        return result;
    }
}
