package com.example.demo;

import java.util.Map;

public class RomanParser {
    public static final int MILS = 1000;
    private final Initializer initializer = new Initializer();

    public String arabicToRoman(int i) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> arabicToRomanMap = initializer.getArabicToRomanMap();

        if (i > 3999) {
            result.append("(").append(arabicToRoman(i / MILS)).append(")");
            i -= i / MILS * MILS;
        }

        while (i > 0) {
            int biggestValue = 0;
            for (Map.Entry<Integer, String> pair : arabicToRomanMap.entrySet()) {
                if (pair.getKey() > biggestValue && pair.getKey() <= i) {
                    biggestValue = pair.getKey();
                }
            }

            result.append(arabicToRomanMap.get(biggestValue));
            i -= biggestValue;
        }

        return result.toString();
    }
}
