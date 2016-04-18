package com.capgemini.excercise3;

import com.capgemini.util.HelloWorld;

public class Excercise3a {

    public static void process(HelloWorld hw) {
        hw.printString(2);
    }

    public static void main(String... args) {

        // 1. Refactor to a lambda expression
        process(new HelloWorld() {
            @Override
            public void printString(int number) {
                for (int i = 0; i < number; i++) {
                    System.out.println("ANONYMOUS: Hello World " + i);
                }
            }
        });
    }

}