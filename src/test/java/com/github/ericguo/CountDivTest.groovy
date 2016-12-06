package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/6/2016.
 */
class CountDivTest extends Specification {
    void setup() {

    }

    void cleanup() {

    }

    def "Solution"() {

        expect:
        CountDiv.solution(A, B, K) == rt
        where:
        A | B  | K | rt
        6 | 11 | 2 | 3

    }
}
