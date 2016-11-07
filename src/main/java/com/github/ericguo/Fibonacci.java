package com.github.ericguo;

import java.math.BigInteger;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/7/2016.
 */
public class Fibonacci {

    public static final int calculate(int n) {

        if (n <= 1) return n;
        else return calculate(n - 1) + calculate(n - 2);
    }

    public static BigInteger fibonacci(int n) {


        int count = n;
        BigInteger tmpA, tmpP;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        BigInteger p = BigInteger.ZERO;
        BigInteger q = BigInteger.ONE;
        BigInteger two = new BigInteger("2");

        while (count != 0) {

            if ((count & 1) == 0) {
                tmpP = p.multiply(p).add(q.multiply(q));
                q = two.multiply(p.multiply(q)).add(q.multiply(q));
                p = tmpP;
                count >>= 1;
            } else {
                tmpA = b.multiply(q).add(a.multiply(q).add(a.multiply(p)));
                b = b.multiply(p).add(a.multiply(q));
                a = tmpA;
                count--;
            }

        }

        return b;


    }
}
