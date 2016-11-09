package com.github.ericguo;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/7/2016.
 */
public class Fibonacci {

    private static HashMap<Object, Long> fiboMap=new HashMap<>();

    public static final int calculate(int n) {

        if (n <= 1) return n;
        else return calculate(n - 1) + calculate(n - 2);

    }

    public static final long calculateFib(long n) {

        if (n <= 1) return n;
        if (n == 2) return 1;
        long[] fib = new long[(int)n+1];
        for (long i = 0; i <=n; i++) {
            if (i<= 1) {
                fib[(int)i] = i;
            } else if (i == 2) {
                fib[(int)i]=1;
            } else {
                fib[(int)i] = fib[(int)i - 1] + fib[(int)i - 2];
            }

        }


        return fib[(int)n];

    }


    private static long[] cache=new long[100];
    public static long fibonacciWithStaticArray(long k) {
        if (k == 0 || k == 1) {
            return k;
        }
        if(cache[(int)k]!=0)return cache[(int)k];

        else
            return fibonacciWithStaticArray(k-1)+fibonacciWithStaticArray(k-2);


    }
    public static long fibonacciWithMap(long k) {
        if (k == 0 || k == 1) {
            return k;
        }

        try {
            // do not calculate anymore, just return it
            return fiboMap.get(k);
        } catch (NullPointerException np) {
            // has to be calculated once, then save it
            // calculation part
            long value = fibonacciWithMap(k - 1) + fibonacciWithMap(k - 2);
            // saving part
            fiboMap.put(k, value);
            return value;
        }
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
