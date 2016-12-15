package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/6/2016.
 */
class HelloA {



    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("static A");
    }

}

public class HelloB extends HelloA {
    private String id;


    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("static B");
    }


    public static void main(String[] args) {

        System.out.println("-------main start-------");
        new HelloB();
        new HelloB();
        System.out.println("-------main end-------");

    }
}
