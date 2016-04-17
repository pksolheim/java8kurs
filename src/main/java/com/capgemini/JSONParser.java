package com.capgemini;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 17.04.16
 * Time: 19:19
 * To change this template use File | Settings | File Templates.
 */
public class JSONParser {

    private ScriptEngine engine;

    public JSONParser() {
        ScriptEngineManager sem = new ScriptEngineManager();
        this.engine = sem.getEngineByName("javascript");

    }

    public JSONListAdapter parse(String fileName) throws IOException, ScriptException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        String json = new String(Files.readAllBytes(file.toPath()));
        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = this.engine.eval(script);
        //assertThat(result, instanceOf(Map.class));
        return (JSONListAdapter) result;
    }


}
