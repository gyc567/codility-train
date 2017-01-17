package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 1/17/2017.
 */
class MaximumGapTest extends Specification {
    def "MaximumGap"() {
        expect:
        MaximumGap.maximumGap(A) == mxCap
        where:
        A                        | mxCap
        [4, 3, 2, 1, 8] as int[] | 4

    }
}
