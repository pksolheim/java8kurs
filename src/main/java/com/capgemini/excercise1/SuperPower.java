package com.capgemini.excercise1;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 18.04.16
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public interface SuperPower {
    default String apply() {
        return "Heat vision!";
    }
}
