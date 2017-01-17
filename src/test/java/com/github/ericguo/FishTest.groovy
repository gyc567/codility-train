package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/17/2017.
 */
class FishTest extends Specification {
    def "Solution"() {

        expect:
        Fish.solution(A, B) == count
        where:
        A                        | B                        | count
        [4, 3, 2, 1, 5] as int[] | [0, 1, 0, 1, 0] as int[] | 2

    }
}
