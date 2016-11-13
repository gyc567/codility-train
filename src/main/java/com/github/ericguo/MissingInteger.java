package com.github.ericguo;

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

        boolean[] seen=new boolean[length];
        for (int i = 0; i < A.length; i++) {
            if(A[i]<-2147483648||A[i]>2147483647)return -1;
            seen[A[i]-1]=true;
        }

        for (int i = 0; i < seen.length; i++) {
            if (seen[i]==false)
            {
                return i+1;
            }
        }


        return length+1;
    }
}
