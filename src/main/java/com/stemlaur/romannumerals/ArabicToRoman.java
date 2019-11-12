package com.stemlaur.romannumerals;

public final class ArabicToRoman {

    public String from(final int arabicNumber) {
        final StringBuilder builder = new StringBuilder();
        int remaining = arabicNumber;
        for (int i = 100; i <= arabicNumber; i += 100) {
            builder.append("C");
            remaining -= 100;
        }

        int remainingTens = remaining;
        for (int i = 10; i <= remainingTens; i += 10) {
            builder.append("X");
            remaining -= 10;
        }

        if (remaining >= 5) {
            builder.append("V");
            remaining -= 5;
        }

        int remainingOnes = remaining;
        for (int i = 1; i <= remainingOnes; i++) {
            builder.append("I");
        }

        return builder.toString();
    }
}
