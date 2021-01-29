package com.epam.task.second.editor;

import com.epam.task.second.editors.TextEditor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TextEditorTest {

    private  final static List<String> TEST_DATA = Arrays.asList("There", "is", "nothing", "either",  "good", "or","bad", "but", "thinking", "mak", "itt", "soo");
    private final TextEditor editor = new TextEditor();

    @Test
    public void testDeleteWordsGivenLengthStartsWithConsonantLetterShouldDoItsWork(){
        List<String> expected = Arrays.asList("There", "is", "nothing", "either",  "good", "or", "thinking", "itt");
        List<String> actual = editor.deleteWordsGivenLengthStartsWithConsonantLetter(TEST_DATA, 3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceLetterOnGivenPositionShouldReplaceLetterIfWordShorterThatTheNumberOfPosition(){
        List<String> expected = Arrays.asList("Thore", "is", "noohing", "eioher",  "good", "or","bao", "buo", "thonking", "mao", "ito", "soo");
        List<String> actual = editor.replaceLetterOnGivenPosition(TEST_DATA, 3, 'o');
        Assert.assertEquals(expected, actual);
    }
}
