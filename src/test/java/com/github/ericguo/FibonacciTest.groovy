package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/7/2016.
 */
class FibonacciTest extends Specification {
    def "Calculate,give:#n fibonacci number shall be #f"() {

        expect:
        f == Fibonacci.calculate(n)
        where:
        f            | n
        0            | 0
        1            | 1
        1            | 2
        2            | 3
        3            | 4
        5            | 5
        8            | 6
        5702887  | 34
        63245986 | 39
        956722026041 | 59
    }


    def "give:#v the fibonacci number shall be #f"() {
        expect:
        f == Fibonacci.fibonacci(v)
        where:
        f            | v
        0            | 0
        1            | 1
        1            | 2
        2            | 3
        3            | 4
        5            | 5
        8            | 6
        5702887  | 34
        63245986 | 39
        956722026041 | 59
    }

    def "give:#v the calculateFib number shall be #f"() {
        expect:
        f == Fibonacci.calculateFib(v)
        where:
        f        | v
        0        | 0
        1        | 1
        1        | 2
        2        | 3
        3        | 4
        5        | 5

        8        | 6
        5702887  | 34
        63245986 | 39

    }

    def "give:#v the fibonacciWithMap number shall be #f"() {
        expect:
        f == Fibonacci.fibonacciWithMap(v)
        where:
        f        | v
        0        | 0
        1        | 1
        1        | 2
        2        | 3
        3        | 4
        5        | 5

        8        | 6
        5702887  | 34
        63245986 | 39
        956722026041 | 59

    }

    def "give:#v the fibonacciWithStaticArray number shall be #f"() {
        expect:
        f == Fibonacci.fibonacciWithStaticArray(v)
        where:
        f        | v
        0        | 0
        1        | 1
        1        | 2
        2        | 3
        3        | 4
        5        | 5

        8        | 6
        5702887  | 34
        63245986 | 39
        //956722026041 | 59

    }
}
