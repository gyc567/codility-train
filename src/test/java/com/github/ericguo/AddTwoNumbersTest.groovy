package com.github.ericguo

import spock.lang.Specification

/**
 * Created by eric567 [email:gyc567@126.com] 
 * on 12/22/2016.
 */
class AddTwoNumbersTest extends Specification {

    def "AddTwoNumbers"() {
        given:"Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)"
         ListNode node1=new  ListNode(2);
         ListNode node12=new  ListNode(4);
         ListNode node13=new  ListNode(3);
        node1.next=node12;
        node12.next=node13;
         ListNode node2=new  ListNode(5);
         ListNode node22=new  ListNode(6);
         ListNode node23=new  ListNode(4);
        node2.next=node22;
        node22.next=node23;

        when:"invoke addTwoNumbers method"
         ListNode rt=new  ListNode(0);
        rt=AddTwoNumbers.addTwoNumbers(node1,node2)


        then:"shall return a linkedlist:7 -> 0 -> 8"
        rt!=null








    }
}
