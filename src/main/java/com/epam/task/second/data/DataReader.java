package com.epam.task.second.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataReader {

    private final static Logger LOGGER = Logger.getLogger(DataReader.class.getName());

    public List<String> readDataFromFile(String filename){
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
        return lines;
    }
}
