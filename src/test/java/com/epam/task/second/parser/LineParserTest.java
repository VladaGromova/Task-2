package com.epam.task.second.parser;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LineParserTest {

    private  final static String TEST_DATA = "There is nothing either good or bad, but thinking makes it so";
    private LineParser parser = new LineParser();

    @Test
    public void testParseLineShouldParseLineToListOfWords(){
        List<String> expected = Arrays.asList("There", "is", "nothing", "either",  "good", "or","bad", "but", "thinking", "makes", "it", "so");
        List<String> actual = parser.parseLine(TEST_DATA);
        Assert.assertEquals(expected, actual);
    }
}
