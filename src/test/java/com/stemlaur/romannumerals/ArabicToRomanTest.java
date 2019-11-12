package com.stemlaur.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanTest {

    @Test
    public void should_work_for_unitary_roman_numerals() {
        assertEquals("I", new ArabicToRoman().from(1));
        assertEquals("II", new ArabicToRoman().from(2));
        assertEquals("III", new ArabicToRoman().from(3));
        assertEquals("V", new ArabicToRoman().from(5));
        assertEquals("VI", new ArabicToRoman().from(6));
        assertEquals("VII", new ArabicToRoman().from(7));
    }
}
