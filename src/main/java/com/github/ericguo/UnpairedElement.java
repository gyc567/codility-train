package com.github.ericguo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/7/2016.
 */
public class UnpairedElement {
    /**
     * A non-empty zero-indexed array A consisting of N integers is given.
     * The array contains an odd number of elements, and each element of the array can be
     * paired with another element that has the same value, except for one element that is left unpaired.
     * <p>
     * For example, in array A such that:
     * A[0] = 9  A[1] = 3  A[2] = 9
     * A[3] = 3  A[4] = 9  A[5] = 7
     * A[6] = 9
     * <p>
     * the elements at indexes 0 and 2 have value 9,
     * the elements at indexes 1 and 3 have value 3,
     * the elements at indexes 4 and 6 have value 9,
     * the element at index 5 has value 7 and is unpaired.
     * <p>
     * Write a function:
     * <p>
     * int solution(int A[], int N);
     * <p>
     * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
     * <p>
     * For example, given array A such that:
     * A[0] = 9  A[1] = 3  A[2] = 9
     * A[3] = 3  A[4] = 9  A[5] = 7
     * A[6] = 9
     * <p>
     * the function should return 7, as explained in the example above.
     * <p>
     * Assume that:
     * <p>
     * N is an odd integer within the range [1..1,000,000];
     * each element of array A is an integer within the range [1..1,000,000,000];
     * all but one of the values in A occur an even number of times.
     * <p>
     * Complexity:
     * <p>
     * expected worst-case time complexity is O(N);
     * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
     *
     * @param A
     * @return
     */
    private static Logger logger = Logger.getLogger(String.valueOf(UnpairedElement.class));

    public static int solution(int[] A) {
        int res = 0;
        if (A.length == 0) return res;
        for (int i : A) {
            res = res ^ i; // Implementation of XOR
        }
        return res;
    }

    public static final int solutionWithLambda(int[] A) {
        //Java 8 Streams & Lambdas solution by the Architect https://disqus.com/by/op8rv315/

        // To boxed array
        Integer[] newArray = Arrays.stream( A ).boxed().toArray( Integer[]::new );
        List<Integer> numberList = Arrays.asList(newArray);

        Optional odd = numberList.stream()
                .reduce((Integer x, Integer y) -> x ^ y);

        if (!odd.isPresent()) return 0;
        Object o = odd.get();

        Integer rt = Integer.valueOf(o.toString());
        return rt;
    }


}
