package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/10/2016.
 * zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class AddTwoNumbers { public int solution(int[] A); }
 * <p>
 * that, given a zero-indexed array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * <p>
 * the function should return 4, as it is the missing element.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * <p>
 * Elements of input arrays can be modified.
 */
public class PermMissingElem {
    public static int solution(int[] A) {



        int length = A.length;
        if (length < 0 || length > 100000) {
            return 0;
        }
        int excptSum = 0;
        int actualSum = 0;
//        for (int i = 1; i <= length + 1; i++) {
//            excptSum += i;
//        }

        excptSum=(1+length+1)*(length+1)/2;//more efficient to sum
        for (int i = 0; i < length; i++) {
            if (A[i] < 1 || A[i] > length + 1) return 0;
            actualSum += A[i];
        }

        return excptSum - actualSum;
    }
}
