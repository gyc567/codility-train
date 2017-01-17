package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/16/2017.
 */
class NestingTest extends Specification {
    def "Solution"() {

        expect:
        Nesting.solution(A) == count
        where:
        A            | count
        "())"        | 0
        "(())"       | 1
        "((())"      | 0
        "(()(())())" | 1

    }
}
