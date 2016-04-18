package com.capgemini.exercise3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class Exercise3bImpl implements Exercise3b{

    //Look at the documentation of package java.util.function and find a pre built interface to solve the following problems
    //Bonus points for method references!! :)

    //1. Use a funcitonal interface to map a String value to a boolean value.
    public void stringToBoolean(String value)
    {
        throw new NotImplementedException();
    }

    //2. Use a functional interface to test if a String is longer than 5 letters
    public void longString(String toTest)
    {
        throw new NotImplementedException();
    }

    //3. Use a built in functional interface to take a list of names and add a suffix to all names.
    public void mapNames(List<String> l, String suffix)
    {
        throw new NotImplementedException();
    }

    //4. Use  a built in functional interface to concatenate two Strings
    public void concatenateStrings(String firstName, String lastName)
    {
        throw new NotImplementedException();
    }

    //5. Use a built in functional interface to create a new String.
    public  void createString()
    {
        throw new NotImplementedException();
    }

    public static void main (String[] args)
    {
        Exercise3b exercise;

        exercise = new com.capgemini.exercise3.Exercise3bImpl();
        exercise.concatenateStrings("Rocky", "Balboa");
        exercise.longString("Humphrey");
        exercise.stringToBoolean("TRUE");
        exercise.mapNames(Arrays.asList(new String[]{"Superman", "Batman", "Wonder Woman", "Indiana Jones"}), "rules (not).");
        exercise.createString();
    }
}
