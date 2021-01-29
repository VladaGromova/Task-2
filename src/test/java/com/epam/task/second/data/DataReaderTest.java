package com.epam.task.second.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {
    private  final static String TEST_DATA = "src/test/resources/input.txt";
    private  final static String FALSE_DATA = "src/test/resources/output.txt";
    private DataReader reader = new DataReader();
    @Test
    public void testReadDataFromFileShouldReadLinesFromFileWhenFileExists(){
        List<String> expected = Arrays.asList("Oracle (and others; just to - test) highly recommend uninstalling outdated versions of Java.", "Apps: Java applications are typically compiled to bytecode that can run on any Java virtual machine.");
        List<String> actual = reader.readDataFromFile(TEST_DATA);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadDataShouldThrowExceptionWhenFileDoesNotExist(){
        List<String> actual = reader.readDataFromFile(FALSE_DATA);
    }
}
