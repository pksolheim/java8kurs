package main.java.com.capgemini.excercise2.fasit;

import main.java.com.capgemini.excercise2.Exercise2b;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Exercise2bImpl implements Exercise2b{

    //Look at the documentation of package java.util.function and find a pre built interface to solve the following problems
    //Bonus points for method references!! :)

    //1. Use a funcitonal interface to map a String value to a boolean value.
    public void stringToBoolean(String value)
    {
        Function<String, Boolean> f = Boolean::new;
        //Function<String, Boolean> f = s -> new Boolean(s);
        System.out.println(f.apply(value));
    }

    //2. Use a functional interface to test if a String is longer than 5 letters
    public void longString(String toTest)
    {
        Predicate<String> longString = s -> s.length() > 5;
        System.out.print(longString.test(toTest));
    }

    //3. Use a built in functional interface to take a list of names and add a suffix to all names.
    public void mapNames(List<String> l, String suffix)
    {
        Consumer<String> c = s -> System.out.print(String.format("%s ", s+ " " + suffix));
        processList(l, c);
    }

    public void processList(List<String> list, Consumer<String> cons)
    {
        for(String s : list) {
            cons.accept(s);
        }
    }

    //4. Use  a built in functional interface to concatenate two Strings
    public void concatenateSrtings(String firstName, String lastName)
    {
        UnaryOperator<String> uo = s -> s + " " + lastName;
        System.out.print(uo.apply(firstName));
    }

    //5. Use a built in functional interface to create a new String.
    public  void createString()
    {
        Supplier<String> i  = ()-> "Java 8 rocks!";
        System.out.println(i.get());
    }

    public static void main (String[] args)
    {
        Exercise2b exercise;

        exercise = new Exercise2bImpl();
        exercise.concatenateSrtings("Rocky", "Balboa");
        exercise.longString("Humphrey");
        exercise.stringToBoolean("TRUE");
        exercise.mapNames(Arrays.asList(new String[]{"Jens", "Erna", "Per", "Jonas", "Magne"}), "rules (or?).");
        exercise.createString();
    }
}
