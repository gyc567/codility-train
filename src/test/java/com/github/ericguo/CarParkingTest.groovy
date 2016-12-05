package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 11/21/2016.
 */
class CarParkingTest extends Specification {
    void setup() {

    }

    void cleanup() {

    }

    def "Solution #E,#L, return #cost"() {


        expect:
        CarParking.solution(E, L) == cost
        where:
        E       | L       | cost
        "10:00" | "13:21" | 17
        "09:42" | "11:42" | 9
        "09:42" | "11:41" | 9
    }
}
