package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/7/2016.
 */
class UnpairedElementTest extends Specification {
    /**
     * A[0] = 9  A[1] = 3  A[2] = 9
     A[3] = 3  A[4] = 9  A[5] = 7
     A[6] = 9
     * @return 7
     */
    def "Solution given integer array #n shall return #unpaired element"() {

        given:"the integer array "
        int[] n=[9,3,9,3,9,7,9]
        when:
        int unpaired=UnpairedElement.solution(n)
        then:
        unpaired==7

        int[] n2=[]
        then:
        0==UnpairedElement.solution(n2)

    }
    def "Solution given integer array #n shall return #odd occurrence element"() {

        given:"the integer array "
        int[] n=[9,3,9,3,9,7,9]
        when:
        int unpaired=UnpairedElement.solutionWithLambda(n)
        then:
        unpaired==7

        int[] n2=[]
        then:
        0==UnpairedElement.solutionWithLambda(n2)

    }
}
