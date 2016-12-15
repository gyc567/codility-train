package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/6/2016.
 */
class PassingCarTest extends Specification {
    def "Solution"() {

        expect:
        PassingCar.solution2(A) == rt
        where:
        A                        | rt
        [0, 1, 0, 1, 1] as int[] | 5

    }
}
