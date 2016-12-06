package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/6/2016.
 */
class FrogRiverOneTest extends Specification {
    void setup() {

    }

    void cleanup() {

    }

    def "give the x,and array shall return the right index"() {
        expect:
        FrogRiverOne.frog(x, A) == rt
        where:
        x | A                                 | rt
        5 | [1, 3, 1, 4, 2, 3, 5, 4] as int[] | 6
        5 | [1, 3, 1, 4, 2, 3, 4, 5] as int[] | 7



    }
}
