package com.example.demo;

import java.util.Map;

public class RomanGenerator {
    public static final int MILS = 1000;
    private final Initializer initializer = new Initializer();

    public String from(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> arabicToRomanMap = initializer.getArabicToRomanMap();

        if (arabicNumber > 3999) {
            result.append("(").append(from(arabicNumber / MILS)).append(")");
            arabicNumber -= arabicNumber / MILS * MILS;
        }

        while (arabicNumber > 0) {
            int biggestValue = 0;
            for (Map.Entry<Integer, String> pair : arabicToRomanMap.entrySet()) {
                if (pair.getKey() > biggestValue && pair.getKey() <= arabicNumber) {
                    biggestValue = pair.getKey();
                }
            }

            result.append(arabicToRomanMap.get(biggestValue));
            arabicNumber -= biggestValue;
        }

        return result.toString();
    }
}
