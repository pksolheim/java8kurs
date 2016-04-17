package main.java.com.capgemini.excercise2.fasit;

import main.java.com.capgemini.excercise2.util.HelloWorld;

/**
 * Created by psolheim on 16.04.2016.
 */
public class Excercise2a {

    public static void process(HelloWorld hw) {
        hw.printString(2);
    }

    public static void main(String... args) {

        // refactor to lambda expression
        // anonymous class
//        process(new main.java.com.capgemini.excercise2.util.HelloWorld() {
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

