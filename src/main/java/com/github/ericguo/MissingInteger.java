package com.github.ericguo;

import java.util.HashSet;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/10/2016.
 * <p>
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty zero-indexed array A of N integers,
 * returns the minimal positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given:
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * <p>
 * the function should return 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * <p>
 * Elements of input arrays can be modified.
 */
public class MissingInteger {
    public static int solution(int[] A) {
        int length = A.length;
        if (length < 1 || length > 100000) {
            return -1;
        }

        boolean[] seen = new boolean[length];
        for (int i = 0; i < length; i++) {
            int value = A[i];
            if (value > 0 && value <= length) {

                seen[value - 1] = true;
            }
        }

        for (int i = 0; i < seen.length; i++) {
            if (seen[i] == false) {
                return i + 1;
            }
        }


        return length + 1;
    }

    public int solutionWithSet(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            hset.add(A[i]);

            while (hset.contains(num)) {
                num++;
            }
        }

        return num;
    }

    public static final int getMissingIntger(int[] A) {
        int counter[] = new int[A.length];

// Count the items, only the positive numbers
        for (int i = 0; i < A.length; i++)
            if (A[i] > 0 && A[i] <= A.length)
                counter[A[i] - 1]++;

// Return the first number that has count 0
        for (int i = 0; i < counter.length; i++)
            if (counter[i] == 0)
                return i + 1;

// If no number has count 0, then that means all number in the sequence
// appears so the next number not appearing is in next number after the
// sequence.
        return A.length + 1;
    }
}
