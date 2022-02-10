package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanParser {
    public static final int MILS = 1000;

    public String arabicToRoman(int i) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> arabicToRomanMap = new LinkedHashMap<>() {{
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};

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
