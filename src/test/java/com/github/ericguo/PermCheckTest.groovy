package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/5/2016.
 */
class PermCheckTest extends Specification {
    def "give a array shall return 1 when is perm,else return 0"() {


        expect:
        PermCheck.solution2(A) == rt
        where:
        A                                        | rt
        [2, 3, 1, 4] as int[]                    | 1
        [1, 1] as int[]                          | 0
        [3, 1, 4] as int[]                       | 0
       // [] as int[]                              | 0
        [1, 2, 3, 4, 6] as int[]                 | 0
        [9, 5, 7, 3, 2, 7, 3, 1, 10, 8] as int[] | 0

    }
}
