package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/6/2016.
 */
class MaxCountersTest extends Specification {
    void setup() {

    }

    void cleanup() {

    }

    def "Solution"() {

        expect:
        MaxCounters.solution(x, A) == rt
        where:
        x | A                              | rt
        5 | [3, 4, 4, 6, 1, 4, 4] as int[] | [3, 2, 2, 4, 2]
        1 | [1] as int[] | [1]

    }
}
