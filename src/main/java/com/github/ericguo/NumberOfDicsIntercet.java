package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 1/5/2017.
 */
public class NumberOfDicsIntercet {
    public int solution(int[] A) {

        if (A.length < 2) return 0;

        int pairs = 0;
        int[] layers = new int[A.length];
        int currentLayer = 0;

        for (int i = 0; i < A.length; i++) {

            int borderRight = i + A[i];
            int borderLeft = i - A[i];
            if (borderRight >= A.length || borderRight < i) borderRight = A.length - 1;
            if (borderLeft < 0) borderLeft = 0;

            layers[borderRight] += 1;

            int closingLayer = layers[i];
            layers[i] = currentLayer;

            if (i > 0) {
                if (i - borderLeft > 1) pairs += (i - borderLeft - 1);
                pairs += layers[borderLeft];
                if (pairs > 10000000) return -1;
            }

            layers[i] += 1;
            currentLayer += (1 - closingLayer);
        }

        return pairs;
    }
}
