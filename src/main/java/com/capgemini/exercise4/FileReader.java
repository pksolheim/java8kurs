package com.capgemini.exercise4;

import com.capgemini.domain.SuperHero;
import com.google.gson.Gson;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 17.04.16
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class FileReader {

    private List<String> listOfNames = new ArrayList<>();

    public FileReader() {

    }

    public List<String> readIntoList(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try (BufferedReader br = Files.newBufferedReader(file.toPath())) {
            listOfNames = br.lines()
                    .collect(Collectors.toList());

            return listOfNames;

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }


    }

    public List<SuperHero> convertFromJSON(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        Gson gson = new Gson();

        try (BufferedReader br = Files.newBufferedReader(file.toPath())) {
            SuperHero[] superHeros = gson.fromJson(br, SuperHero[].class);

            return Arrays.stream(superHeros)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }

    }

}
