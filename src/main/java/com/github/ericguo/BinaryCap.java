package com.github.ericguo;
/*


A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

    class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

        N is an integer within the range [1..2,147,483,647].

Complexity:

        expected worst-case time complexity is O(log(N));
        expected worst-case space complexity is O(1).


 */

import java.util.stream.Stream;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/1/2016.
 */
public class BinaryCap {
    public static int solution(int N) {
        // write your code in Java SE 8
        String s = Integer.toBinaryString(N);
        //System.out.println("=========="+s);


        char[] bArr = s.toCharArray();
        int zeroCountLeft = 0;
        int countMaxLeft = 0;
        int zeroCountRight = 0;
        int countMaxRight = 0;

        int length = bArr.length;
        for (int i = 0, j = length - 1; i < length&&j>=0; i++,j--) {
            //left
            if (bArr[i] == '1') {
                if (countMaxLeft < zeroCountLeft) {
                    countMaxLeft = zeroCountLeft;
                }

                zeroCountLeft = 0;

            }

            if (bArr[i] == '0') {
                zeroCountLeft++;
            }

            //right
            if (bArr[j] == '1') {
                if (countMaxRight < zeroCountRight) {
                    countMaxRight = zeroCountRight;
                }

                zeroCountRight = 0;

            }

            if (bArr[j] == '0') {
                zeroCountRight++;
            }

            //compare left and right
            if(i>j&&bArr[i]=='1'&&bArr[j]=='1')
            {
                if(countMaxLeft<countMaxRight)
                {
                    countMaxLeft=countMaxRight;
                }
                break;
            }




        }
        return countMaxLeft;
    }



    public static int getLongestZeroNumber(int N) {
        return Stream.of(
                Integer.toBinaryString(N).replaceAll("0+$", "").split("1+")
        ).filter(a -> a != null)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);

    }

}
