package com.github.ericguo

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/1/2016.
 */
class BinaryCapTest extends spock.lang.Specification {

    void setup() {

    }

    void cleanup() {

    }

    def "Solution int #a,int #n"() {

        expect:
        a == BinaryCap.solution(n)
        where:

        a | n
        5 | 1041
        0 | 15
        4 | 529
        1 | 5
        2 | 9
    }
    def "Solution 2 int #a,int #n"() {

        expect:
        a == BinaryCap.getLongestZeroNumber(n)
        where:

        a | n
        5 | 1041
        0 | 15
        4 | 529
        1 | 5
        2 | 9
    }


}
