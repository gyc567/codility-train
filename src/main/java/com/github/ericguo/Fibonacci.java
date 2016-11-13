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
    //this solution is best performance and easiest understood and  maintained
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

   public static long  fib(int n)
    {
        if (n == 1 || n == 2) {
            return 1;
        }

        int i;
        long  SecondLast, ThirdLast, Last=0;

        SecondLast = ThirdLast = 1;

        for (i = 1; i <= n - 2; ++i) {
            Last = SecondLast + ThirdLast;
            ThirdLast = SecondLast;
            SecondLast = Last;
        }

        return Last;
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


    /**
     * However, the fastest way to compute the nth Fibonacci number
     * is not this. There is an O(log N) approach which based on
     * the mathematical approximation formula –

     f_n \approx \frac{1}{\sqrt{5}} \left ( \frac{1 + \sqrt{5}}{2} \right )^{n + 1}

     The value computed by f_n is such that it very close to the nth Fibonacci number, so it can be rounded off to the nearest integer to get the nth Fibonacci number. The value \frac{1 + \sqrt{5}}{2} is called phi, or “φ”, or the Golden Ratio. Now, the question is how to calculate \phi^{n + 1} in O(log N) time. We do this,
     by using Binary Exponentiation Technique, which works by Dynamic Programming…!
     * @param x
     * @param n
     * @return
     */
    double BinaryExponentiation(double x, int n)
    {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            double temp = BinaryExponentiation(x, n / 2);

            if (n % 2 == 0) {
                return temp * temp;
            } else {
                return x * temp * temp;
            }
        }
    }
}
