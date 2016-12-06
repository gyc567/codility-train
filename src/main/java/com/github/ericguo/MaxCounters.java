package com.github.ericguo;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 * <p>
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * <p>
 * A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:
 * <p>
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * <p>
 * For example, given integer N = 5 and array A such that:
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * <p>
 * the values of the counters after each consecutive operation will be:
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * <p>
 * The goal is to calculate the value of every counter after all operations.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int N, int[] A); }
 * <p>
 * that, given an integer N and a non-empty zero-indexed array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 * <p>
 * The sequence should be returned as:
 * <p>
 * a structure Results (in C), or
 * a vector of integers (in C++), or
 * a record Results (in Pascal), or
 * an array of integers (in any other programming language).
 * <p>
 * For example, given:
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * <p>
 * the function should return [3, 2, 2, 4, 2], as explained above.
 * <p>
 * Assume that:
 * <p>
 * N and M are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..N + 1].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N+M);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * <p>
 * Elements of input arrays can be modified.
 * <p>
 * Created by eric567 [email:gyc567@126.com]
 * on 12/6/2016.
 */
public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        if (N < 1 || N > 100000) return null;

        int[] rtArray = new int[N];
        int maxCounter = 0;
        int lastMax = 0;
        for (int i = 0; i < A.length; i++) {


            int idx = A[i];
            if (idx < 1 || idx > N + 1) {
                return null;
            }
            if (idx >= 1 && idx <= N) {
                if (rtArray[idx - 1] < lastMax) {
                    rtArray[idx - 1] = lastMax;
                }
                rtArray[idx - 1]++;

                if (rtArray[idx - 1] > maxCounter) {

                    maxCounter = rtArray[idx - 1];
                }
            } else if (A[i] == N + 1) {

                lastMax = maxCounter;


            }
        }
        for (int i1 = 0; i1 < rtArray.length; i1++) {
            if (rtArray[i1] < lastMax) {
                rtArray[i1] = lastMax;
            }
        }
        return rtArray;
    }
}
