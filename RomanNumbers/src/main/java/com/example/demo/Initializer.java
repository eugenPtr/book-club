package com.example.demo;

import java.util.LinkedHashMap;

public class Initializer {
    public LinkedHashMap<Integer, String> getArabicToRomanMap() {
        return new LinkedHashMap<>() {{
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
    }
}
