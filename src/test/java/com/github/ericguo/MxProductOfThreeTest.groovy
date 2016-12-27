package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/26/2016.
 */
class MxProductOfThreeTest extends Specification {
    def "Solution"() {


        expect:
        MxProductOfThree.solution( A) == rt
        where:
        A                       | rt
        [89, 5, 12, 0] as int[] | 5340
        [-3, 1,2,-2,5, 6] as int[] | 60
        [-5,-6, 4,-5, 5] as int[] | 150
    }
}
