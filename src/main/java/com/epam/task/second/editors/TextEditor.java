package com.epam.task.second.editors;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    public List<String> deleteWordsGivenLengthStartsWithConsonantLetter(List<String> inputLine, int length){
        ArrayList<String> line = new ArrayList<>(inputLine);
        for (int i=0; i<line.size(); ++i){
            String word = line.get(i);
            boolean firstCondition = word.length()==length;
            //boolean secondCondition = !word.matches("^[aeiouy]");
            boolean secondCondition = !(word.charAt(0)=='A'||word.charAt(0)=='a'||word.charAt(0)=='E'||word.charAt(0)=='e'||word.charAt(0)=='I'||word.charAt(0)=='i'||word.charAt(0)=='O'||word.charAt(0)=='o'||word.charAt(0)=='U'||word.charAt(0)=='u'||word.charAt(0)=='Y'||word.charAt(0)=='y');
            boolean fit = (firstCondition)&&(secondCondition);
            if(fit){
                line.remove(i);
                --i;
            }
        }
        return line;
    }

    public List<String> replaceLetterOnGivenPosition(List<String> inputLine, int k, char letter) {
        ArrayList<String> line = new ArrayList<>(inputLine);
        for (int i=0; i<line.size(); ++i) {
            String word = line.get(i);
            if (k <= word.length()) {
                StringBuilder mutableWord = new StringBuilder(word);
                mutableWord.replace(k - 1, k, String.valueOf(letter));
                String changedWord = mutableWord.toString();
                line.remove(i);
                line.add(i, changedWord);
            }
        }
        return line;
    }
}
