package com.capgemini;

import com.capgemini.exercise1.SuperHeroAbilities;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 18.04.16
 * Time: 10:05
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1Test {

    private SuperHeroAbilities superHeroAbilities;

    @Before
    public void init() {
        superHeroAbilities = new SuperHeroAbilities();
    }

    @Test
    public void testSuperHeroAbility() {
        assertThat(superHeroAbilities.apply(), is("Heat vision!"));
    }
}
