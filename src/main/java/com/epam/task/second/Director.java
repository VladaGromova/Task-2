package com.epam.task.second;

import com.epam.task.second.data.DataReader;
import com.epam.task.second.editors.TextEditor;
import com.epam.task.second.parser.LineParser;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Director {

    private DataReader reader;
    private LineParser parser;
    private TextEditor editor;

    private final static Logger LOGGER = Logger.getLogger(Director.class.getName());

    public Director(DataReader reader, LineParser parser, TextEditor editor) {
        this.reader = reader;
        this.parser = parser;
        this.editor = editor;
    }

    public ArrayList<String> replaceLettersProcess(String filename){
        LOGGER.info("Replacing process started");
        List<String> text = reader.readDataFromFile(filename);
        ArrayList<String> result = new ArrayList<>();
        for(String line : text){
            List<String> allWords =  parser.parseLine(line);
            List<String> editedWords = editor.replaceLetterOnGivenPosition(allWords, 3, 'o');
            result.addAll(result.size(), editedWords);
        }
        LOGGER.info("Replacing process finished");
        return result;
    }

    public ArrayList<String> deleteWordsByCondition(String filename){
        LOGGER.info("Deleting process started");
        List<String> text = reader.readDataFromFile(filename);
        ArrayList<String> result = new ArrayList<>();
        for(String line : text){
            List<String> allWords =  parser.parseLine(line);
            List<String> editedWords = editor.deleteWordsGivenLengthStartsWithConsonantLetter(allWords, 5);
            result.addAll(result.size(), editedWords);
        }
        LOGGER.info("Deleting process finished");
        return result;
    }
}
