package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/10/2016.
 */
class TapeEquilibriumTest extends Specification {
    def "Solution given integer array #n shall return #minimal difference"() {

        given:"the integer array "
        int[] n=[3,1,2,5,3]
        when:
        int unpaired=TapeEquilibrium.solution(n)
        then:
        unpaired==2



    }
    def "integer array#n shall return minimal diff value #rt"()
    {
        expect:
        TapeEquilibrium.solution(n)==rt
        where:
        rt|n
        1|[3,1,2,4,3] as int[]
        Integer.MAX_VALUE|[3,1,2,4,10000] as int[]

    }
    def "empty array"()
    {

        given:"the integer array "
        int[] n2=[]
        when:
        int zeroRt=TapeEquilibrium.solution(n2)
        then:
        Integer.MAX_VALUE==zeroRt

    }
}
