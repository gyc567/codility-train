package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/4/2017.
 */
class TriangleTest extends Specification {
    def "Solution"() {


        expect:
        Triangle.solution(A) == rt
        where:
        A                             | rt
        [10, 2, 5,6, 1, 8, 20] as int[] | 1
        [10, 50, 5, 1] as int[] | 0

    }
}
