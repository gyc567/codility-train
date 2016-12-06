package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/6/2016.
 */
public class PassingCar {

    public static int solution(int A[]) {
        int i = A.length - 1;
        int tmp = 0;
        int res = 0;
        while (i >= 0) {
            if (A[i] == 0) {
                res += tmp;
            } else {
                tmp++;
            }
            --i;
        }
        return res;
    }
}
