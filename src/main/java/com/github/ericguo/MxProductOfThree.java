package com.github.ericguo;

import java.util.Arrays;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/26/2016.
 */
public class MxProductOfThree {
    public static int solution(int[] A)
    {

        Arrays.sort(A);

        int mx=1;
        int max=1;
        for (int i = A.length-1; i >A.length-4; i--) {
            mx*=A[i];
        }

        max=A[0]*A[1]*A[A.length-1];
        if(max>mx)
            mx=max;
        return mx;
    }
}
