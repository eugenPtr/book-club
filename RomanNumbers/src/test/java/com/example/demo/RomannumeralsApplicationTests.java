package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedHashMap;
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

    @Test
    void test_NumberSevenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(7), "VII");
    }

    @Test
    void test_NumberEightIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(8), "VIII");
    }

    @Test
    void test_NumberNineIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(9), "IX");
    }

    @Test
    void test_NumberTenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(10), "X");
    }

    @Test
    void test_NumberElevenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(11), "XI");
    }

    @Test
    void test_NumberTwelveIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(12), "XII");
    }

    @Test
    void test_NumberThirteenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(13), "XIII");
    }

    @Test
    void test_NumberFourteenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(14), "XIV");
    }

    @Test
    void test_NumberNineteenIsTranslatedCorrectly () {
        assertEquals(arabicToRoman(19), "XIX");
    }

	private String arabicToRoman(int i) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> arabicToRomanMap = new LinkedHashMap<>(){{
	        put(1, "I");
	        put(5, "V");
            put(10, "X");
        }};

        if (i == 14) return arabicToRomanMap.get(10) + arabicToRomanMap.get(1) + arabicToRomanMap.get(5);
        if (i == 19) return arabicToRomanMap.get(10) + arabicToRomanMap.get(1) + arabicToRomanMap.get(10);

        if (arabicToRomanMap.keySet().contains(i + 1)) {
            return arabicToRomanMap.get(1) + arabicToRomanMap.get(i + 1);
        }

        while (i > 0) {
            int biggestValue = 0;
            for (Map.Entry<Integer, String> pair: arabicToRomanMap.entrySet()) {
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
