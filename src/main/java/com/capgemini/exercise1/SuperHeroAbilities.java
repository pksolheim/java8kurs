package com.capgemini.exercise1;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 18.04.16
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */
public class SuperHeroAbilities implements SuperPower, Weakness {
    @Override
    public String apply() {
        return SuperPower.super.apply();
    }
}
