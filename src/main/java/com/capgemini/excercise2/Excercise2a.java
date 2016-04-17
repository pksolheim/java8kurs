package main.java.com.capgemini.excercise2;

import main.java.com.capgemini.excercise2.util.HelloWorld;

public class Excercise2a {

    public static void process(HelloWorld hw) {
        hw.printString(2);
    }

    public static void main(String... args) {

        // 1. Refactor to a lambda expression
        process(new HelloWorld() {
            @Override
            public void printString(int count) {
                for (int i = 0; i < count; i++) {
                    System.out.println("ANONYMOUS: Hello World " + i);
                }
            }
        });
    }

}