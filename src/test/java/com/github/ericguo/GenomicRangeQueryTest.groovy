package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/20/2016.
 */
class GenomicRangeQueryTest extends Specification {
    def "Solution"() {

        expect:
        GenomicRangeQuery.solution2(S, P, Q) == rt
        where:
        S         | P                  | Q                  | rt
        "CAGCCTA" | [2, 5, 0] as int[] | [4, 5, 6] as int[] | [2, 4, 1]

    }
}
