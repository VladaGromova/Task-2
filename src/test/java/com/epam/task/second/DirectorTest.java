package com.epam.task.second;

import com.epam.task.second.data.DataReader;
import com.epam.task.second.editors.TextEditor;
import com.epam.task.second.parser.LineParser;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DirectorTest {
    //private  final static String FALSE_FILE = "src/test/resources/output.txt";
    private final static List<String> TEST_DATA = Arrays.asList("Oracle (and others; just to - test) highly recommend uninstalling outdated versions of Java.", "Apps: Java applications are typically compiled to bytecode that can run on any Java virtual machine.");

    private static DataReader reader;
    private static LineParser parser;
    private static TextEditor editor;
    @BeforeClass
    public static void before(){

        reader = Mockito.mock(DataReader.class);
        when(reader.readDataFromFile(anyString())).thenReturn(TEST_DATA);
        //when(reader.readDataFromFile(FALSE_FILE)).thenThrow(DataException.class);

        parser = Mockito.mock(LineParser.class);
        when(parser.parseLine("Hello;world - and*everyone!")).thenReturn(Arrays.asList("Hello", "world", "and", "everyone"));

        editor = Mockito.mock(TextEditor.class);
        when(editor.deleteWordsGivenLengthStartsWithConsonantLetter(Arrays.asList("cat", "eye", "dog", "sunny"), 3)).thenReturn(Arrays.asList("eye", "sunny"));
        when(editor.replaceLetterOnGivenPosition(Arrays.asList("hi", "neo", "lucky", "milk"), 3, 'o')).thenReturn(Arrays.asList("hi", "neo", "luoky", "miok"));
    }

    @Test
    public void testDirectorProcess(){
        com.epam.task.second.Director director = new com.epam.task.second.Director(reader, parser, editor);
    }
}
