package com.epam.task.second.parser;

import java.util.Arrays;
import java.util.List;

public class LineParser {

    public List<String> parseLine(String line){
        String[] parts = line.split("\\W+");
        return Arrays.asList(parts);
    }
}
