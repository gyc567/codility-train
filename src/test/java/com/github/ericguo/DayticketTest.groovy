package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/21/2016.
 */
class DayticketTest extends Specification {
    def "Solution,#A,#missing"() {

        expect:
        Dayticket.solution(A) == missing
        where:
        A                            | missing
        [1, 2, 4, 5,7, 29, 30] as int[]  | 11



    }
}
