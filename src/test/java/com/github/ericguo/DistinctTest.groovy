package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/22/2016.
 */
class DistinctTest extends Specification {
    def "Solution"() {

        expect:
        Distinct.quickSort(lo, hi, A) == rt
        where:
        lo | hi | A                       | rt
        0  | 3  | [89, 5, 12, 0] as int[] | [0, 5,12, 89]

    }
}


