package com.capgemini.exercise3.solution;

import com.capgemini.util.HelloWorld;

/**
 * Created by psolheim on 16.04.2016.
 */
public class Exercise3a {

    public static void process(HelloWorld hw) {
        hw.printString(2);
    }

    public static void main(String... args) {

        // refactor to lambda expression
        // anonymous class
//        process(new main.java.com.capgemini.util.HelloWorld() {
//            @Override
//            public void printString(int count) {
//                for (int i = 0; i < count; i++) {
//                    System.out.println("ANONYMOUS: Hello World " + i);
//                }
//            }
//        });

         process((int count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println("LAMBDA: Hello World " + i);
            }
        });
    }
}

