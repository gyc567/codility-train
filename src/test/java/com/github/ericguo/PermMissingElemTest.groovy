package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/10/2016.
 */
class PermMissingElemTest extends Specification {
    def "given the array of integer #A,shall return #missing"() {
        expect:
        PermMissingElem.solution(A) == missing
        where:
        A                        | missing
        [2, 3, 1, 5] as int[]    | 4
        [] as int[]              | 1
        [1, 2, 3, 4, 6] as int[] | 5


    }
}
