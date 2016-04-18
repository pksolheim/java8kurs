package com.capgemini;

import com.capgemini.domain.SuperHero;
import com.capgemini.excercise4.FileReader;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 17.04.16
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class Excercise4Test {

    private List<String> nameList;
    private List<SuperHero> superHeroList;

    @Before
    public void init() {
        FileReader fileReader = new FileReader();
        nameList = fileReader.readIntoList("superheros.txt");
        superHeroList = fileReader.convertFromJSON("superheros-revealed.json");
    }

    @Test
    public void testFileWasRead() {
        assertThat(nameList.size(), is(6));
    }

    @Test
    public void testJoinNames() {

        String joinedNames = superHeroList.stream()
                .map(SuperHero::getFirstName)
                .collect(Collectors.joining(","));

        assertThat(joinedNames, is("Clark,Bruce,Diana,Hal,Steve,Barry"));
    }

    @Test
    public void testLeastPowerful() {

        SuperHero weakling = superHeroList.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getPowerRating(), p2.getPowerRating()))
                .findFirst()
                .get();

        assertThat(weakling.getFirstName(), is("Hal"));
        assertThat(weakling.getLastName(), is("Jordan"));
    }

    @Test
    public void testThatVampiresSuck() {

        Optional<SuperHero> vampire = superHeroList.stream()
                .filter(p -> p.getFirstName().equals("Blade") || p.getLastName().equals("Blade"))
                .findFirst();

        assertThat(vampire.isPresent(), is(false));
    }
}
