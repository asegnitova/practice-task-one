package com.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.practice.exception.ExceptrionInput;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void countWordsWithSuccess() throws ExceptrionInput {
        assertEquals( App.countWord("hello world") , 2);
    }

    @Test(expected = ExceptrionInput.class)
    public void emptyString() throws ExceptrionInput {
        App.countWord("");
    }

}
