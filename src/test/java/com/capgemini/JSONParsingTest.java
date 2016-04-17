package com.capgemini;

import org.junit.Test;

import javax.script.ScriptException;
import java.io.IOException;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JSONParsingTest {

    @Test
    public void parseJson() throws IOException, ScriptException {
        JSONParser jsonParser = new JSONParser();
        JSONListAdapter json = jsonParser.parse("superheros-revealed.json");
        assertThat(json.isEmpty(), is(false));
    }
}