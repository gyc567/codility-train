package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/10/2016.
 */
class FrogJumpTest extends Specification {
    def "integer #x,#y,#d,shall return jump times #jump"() {
        expect:
        FrogJump.solution(x, y, d) == jump
        where:
        jump | x | y | d
        1     | 1 | 2 | 1
        3     | 10 | 85 | 30


    }
    def "frog jump#x,#y,#d,shall return jump times #jump"() {
        expect:
        FrogJump.jump(x, y, d) == jump
        where:
        jump | x | y | d
        1     | 1 | 2 | 1
        3     | 10 | 85 | 30


    }
}
