package com.stemlaur.romannumerals;

public final class ArabicToRoman {

    public String from(int arabicNumber) {
        final StringBuilder builder = new StringBuilder();

        if (arabicNumber >= 5) {
            builder.append("V");
            arabicNumber -= 5;
        }

        if (arabicNumber < 5) {
            for (int i = 1; i <= arabicNumber; i++) {
                builder.append("I");
            }
        }

        return builder.toString();
    }
}
