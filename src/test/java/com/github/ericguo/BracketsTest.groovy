package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/6/2017.
 */
class BracketsTest extends Specification {
    def "Solution"() {

        expect:
        Brackets.solution(A) == rt
        where:
        A          | rt
        "([)()]"   | 0
        "{[()()]}" | 1
        ""         | 1
        "{O}"      | 1



    }
}
