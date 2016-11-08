package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/7/2016.
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] n = {3, 8, 9, 7, 6};
        int k = 1;
        int[] solution = solution(n, k);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("the result is --" + solution[i]);
        }
    }


    public static int[] solution(int[] A, int K) {
        int[] shiftedArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i + K >= A.length)
                shiftedArray[(i + K) % A.length] = A[i];
            else
                shiftedArray[i + K] = A[i];
        }

        return shiftedArray;
    }
}
