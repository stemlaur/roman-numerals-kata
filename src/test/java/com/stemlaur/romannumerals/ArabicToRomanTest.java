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
        assertEquals("VIII", new ArabicToRoman().from(8));
        assertEquals("X", new ArabicToRoman().from(10));
        assertEquals("XI", new ArabicToRoman().from(11));
        assertEquals("XII", new ArabicToRoman().from(12));
        assertEquals("XIII", new ArabicToRoman().from(13));
        assertEquals("XX", new ArabicToRoman().from(20));
        assertEquals("XXX", new ArabicToRoman().from(30));
        assertEquals("C", new ArabicToRoman().from(100));
        assertEquals("CC", new ArabicToRoman().from(200));
        assertEquals("CCC", new ArabicToRoman().from(300));
    }
}
