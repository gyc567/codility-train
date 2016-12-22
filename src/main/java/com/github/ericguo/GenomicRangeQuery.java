package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/20/2016.
 */
public class GenomicRangeQuery {




    public static int[] solution(String S, int[] P, int[] Q) {

        if (P.length < 1 || P.length > 50000 || Q.length < 1 || Q.length > 50000) return null;
        if (P.length != Q.length)
        return null;

        int[] last_seen_A = new int[S.length()];
        int[] last_seen_C = new int[S.length()];
        int[] last_seen_G = new int[S.length()];
        int[] last_seen_T = new int[S.length()];


        for (int idx=0;idx<S.length();idx++) {
            writeCharToList(S.toCharArray(), last_seen_A, 'A', idx);
            writeCharToList(S.toCharArray(), last_seen_C, 'C', idx);
            writeCharToList(S.toCharArray(), last_seen_G, 'G', idx);
            writeCharToList(S.toCharArray(), last_seen_T, 'T', idx);
        }

        int[] solution = new int[Q.length];

        for (int idx=0;idx<Q.length;idx++) {
            int start = P[idx];
            int end = Q[idx];
            //N is an integer within the range [1..100,000];
            //each element of arrays P, Q is an integer within the range [0..N − 1];
            if (start < 0 || start >= 100000 || end < 0 || end >= 100000) return null;
            if (last_seen_A[Q[idx]] >= P[idx])
            solution[idx] = 1;
            else if (last_seen_C[ Q[idx]] >=P[idx])
            solution[idx] = 2;
            else if (last_seen_G[ Q[idx]] >=P[idx])
            solution[idx] = 3;
            else if (last_seen_T[ Q[idx]] >=P[idx])
            solution[idx] = 4;

        }
        return solution;
    }

    public static void writeCharToList(char[] S, int[] last_seen, char c, int idx)

    {
        if (S[idx] == c) {
            last_seen[idx] = idx;
        } else if (idx > 0) {
            last_seen[idx] = last_seen[idx - 1];
        }
    }


}
