package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/7/2016.
 */
class TwoSumTest extends Specification {
    //Given nums = [2, 7, 11, 15], target = 9,

//    Because nums[0] + nums[1] = 2 + 7 = 9,
//    return [0, 1].
    def "TwoSum"() {
        expect:
        TwoSum.twoSum2(A, target) == rt
        where:
        A                       | target | rt
        [2, 7, 11, 15] as int[] | 9      | [0, 1]
        [2, 7, 11, 15] as int[] | 13     | [0, 2]
        [-3, 4, 3, 90] as int[] | 0      | [0, 2]
        [-1,-2,-3,-4,-5] as int[] | -8     | [2, 4]

    }
}
