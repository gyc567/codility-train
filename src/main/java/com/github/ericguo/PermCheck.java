package com.github.ericguo;

import java.util.HashSet;
import java.util.Set;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * <p>
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * <p>
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p>
 * is a permutation, but array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p>
 * is not a permutation, because value 2 is missing.
 * <p>
 * The goal is to check whether array A is a permutation.
 * <p>
 * Write a function:
 * <p>
 * int solution(int A[], int N);
 * <p>
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p>
 * For example, given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p>
 * the function should return 1.
 * <p>
 * Given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p>
 * the function should return 0.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * <p>
 * Elements of input arrays can be modified.
 * <p>
 * Created by eric567 [email:gyc567@126.com]
 * on 12/5/2016.
 */
public class PermCheck {
    public static int solution(int[] A) {
        if (A.length == 0) return 0;

        int max = 0;
        int amout = 0;
        int excptSum = 0;//(1+length+1)*(length+1)/2;//more efficient to sum
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) return 0;
//            amout += A[i];
            set.add(A[i]);
            if (max < A[i]) {
                max = A[i];
            }
        }
        excptSum = (1 + max) * (max) / 2;
        for (Integer it : set) {
            amout += it;
        }
        if (set.size() != A.length) return 0;
        if (excptSum == amout) return 1;
        return 0;
    }

    public static int solution2(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        boolean[] seen = new boolean[A.length];

        for (int value : A) {
            if (value <= 0 || value > A.length)
                return 0;
            if (seen[value - 1]) {
                return 0;
            } else {
                seen[value - 1] = true;
            }
        }

        return 1;
    }
}
