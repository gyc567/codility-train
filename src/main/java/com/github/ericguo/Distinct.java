package com.github.ericguo;

/**
 * Write a function
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * <p>
 * For example, given array A consisting of six elements such that:
 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * <p>
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * <p>
 * Elements of input arrays can be modified.
 * <p>
 * Created by eric567 [email:gyc567@126.com]
 * on 12/22/2016.
 */
public class Distinct {
    public static int solution(int[] A) {
        //1.sort the array
        int length = A.length;
        int middle = length / 2;


        //2.count the distinct

        return -1;
    }

    /*
    algorithm quicksort(A, lo, hi) is
    if lo < hi then
        p := partition(A, lo, hi)
        quicksort(A, lo, p – 1)
        quicksort(A, p + 1, hi)

   algorithm partition(A, lo, hi) is
    pivot := A[hi]
    i := lo     // place for swapping
    for j := lo to hi – 1 do
        if A[j] ≤ pivot then
            swap A[i] with A[j]
            i := i + 1
    swap A[i] with A[hi]
    return i
     */
    public static int[] quickSort(int low, int high, int[] A) {
//        if lo < hi then
//        p := partition(A, lo, hi)
//        quicksort(A, lo, p – 1)
//        quicksort(A, p + 1, hi)
        if (low < high) {
            int p = partition(A, low, high);
            A = quickSort(low, p - 1, A);
            A = quickSort(p + 1, high, A);
        }

        return A;
    }

    //algorithm partition(A, lo, hi) is
//    pivot := A[hi]
//    i := lo     // place for swapping
//    for j := lo to hi – 1 do
//            if A[j] ≤ pivot then
//            swap A[i] with A[j]
//            i := i + 1
//    swap A[i] with A[hi]
//            return i
    public static int partition(int[] A, int lo, int hi) {

        int pivot = A[hi];
        int i = lo;
        for (int j = lo; j <= hi - 1; j++) {
            if (A[j] <= pivot) {
                swap(i, j, A);
                i++;
            }

        }
        swap(i, hi, A);
        return i;
    }

    public static void swap(int a, int b, int[] A) {
        int temp ;
        temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}