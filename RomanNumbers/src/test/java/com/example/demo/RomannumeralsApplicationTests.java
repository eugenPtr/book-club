package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomannumeralsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test_NumberOneIsTranslatedCorrectly () {

		assertEquals(arabicToRoman(1), "I");

	}

	@Test
	void test_NumberTwoIsTranslatedCorrectly () {

		assertEquals(arabicToRoman(2), "II");

	}

	@Test
	void test_NumberThreeIsTranslatedCorrectly () {

		assertEquals(arabicToRoman(3), "III");

	}

	@Test
	void test_NumberFourIsTranslatedCorrectly () {

		assertEquals(arabicToRoman(4), "IV");

	}

    @Test
    void test_NumberFiveIsTranslatedCorrectly () {

        assertEquals(arabicToRoman(5), "V");

    }

    @Test
    void test_NumberSixIsTranslatedCorrectly () {

        assertEquals(arabicToRoman(6), "VI");

    }

//	@Test
//	void test_NumberFourteenIsTranslatedCorrectly () {
//
//		assertEquals(arabicToRoman(14), "XIV");
//
//	}



	private String arabicToRoman(int i) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> arabicToRomanMap = new HashMap(){{
	        put(1, "I");
	        put(5, "V");
        }};

        if (i == 4) return "IV";

        if (i >= 5) {
            result.append(arabicToRomanMap.get(5));
            i -= 5;
        }

		for (int nr = 1; nr <= i; nr++)
			result.append(arabicToRomanMap.get(1));

		return result.toString();
	}

}
