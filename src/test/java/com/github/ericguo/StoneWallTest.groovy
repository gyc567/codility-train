package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/16/2017.
 */
class StoneWallTest extends Specification {
    def "Solution"() {

        expect:
        StoneWall.solution(A) == count
        where:
        A                     | count
        [2, 3, 1, 5] as int[] | 4
        [] as int[]           | 0
        [1, 1] as int[]       | 1
    }
}
