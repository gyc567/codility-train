package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/10/2016.
 */
class MissingIntegerTest extends Specification {

    def "given the array of integer #A,shall return #missing"() {
        expect:
        MissingInteger.solution(A) == missing
        where:
        A                            | missing
        [1, 3, 6, 4, 1, 2] as int[]  | 5
        [1, 3, 6, 4, -1, 2] as int[] | 5
        [0] as int[]                 | 1
        [1] as int[]                 | 2
        [-1] as int[]                | 1


    }

    def "test getMissingIntger given the array of integer #A,shall return #missing"() {
        expect:
        MissingInteger.getMissingIntger(A) == missing
        where:
        A                            | missing
        [1, 3, 6, 4, 1, 2] as int[]  | 5
        [1, 3, 6, 4, -1, 2] as int[] | 5
        [0] as int[]                 | 1
        [1] as int[]                 | 2
        [-1] as int[]                | 1


    }
}
