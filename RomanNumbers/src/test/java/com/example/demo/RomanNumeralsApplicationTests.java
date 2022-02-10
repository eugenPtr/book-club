package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanNumeralsApplicationTests {

    private RomanParser romanParser = new RomanParser();

    @Test
	void contextLoads() {
	}

	@Test
	void test_NumberOneIsTranslatedCorrectly () {
		assertEquals(romanParser.arabicToRoman(1), "I");
	}

	@Test
	void test_NumberTwoIsTranslatedCorrectly () {
		assertEquals(romanParser.arabicToRoman(2), "II");
	}

	@Test
	void test_NumberThreeIsTranslatedCorrectly () {
		assertEquals(romanParser.arabicToRoman(3), "III");
	}

	@Test
	void test_NumberFourIsTranslatedCorrectly () {
		assertEquals(romanParser.arabicToRoman(4), "IV");
	}

    @Test
    void test_NumberFiveIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(5), "V");
    }

    @Test
    void test_NumberSixIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(6), "VI");
    }

    @Test
    void test_NumberSevenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(7), "VII");
    }

    @Test
    void test_NumberEightIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(8), "VIII");
    }

    @Test
    void test_NumberNineIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(9), "IX");
    }

    @Test
    void test_NumberTenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(10), "X");
    }

    @Test
    void test_NumberElevenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(11), "XI");
    }

    @Test
    void test_NumberTwelveIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(12), "XII");
    }

    @Test
    void test_NumberThirteenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(13), "XIII");
    }

    @Test
    void test_NumberFourteenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(14), "XIV");
    }

    @Test
    void test_NumberNineteenIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(19), "XIX");
    }

    @Test
    void test_NumberFortyNineIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(49), "XLIX");
    }

    @Test
    void test_NumberFiftyIsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(50), "L");
    }

    @Test
    void test_Number3589IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(3589), "MMMDLXXXIX");
    }

    @Test
    void test_Number3999IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(3999), "MMMCMXCIX");
    }

    @Test
    void test_Number4000IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(4000), "(IV)");
    }

    @Test
    void test_Number4001IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(4001), "(IV)I");
    }

    @Test
    void test_Number5000IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(5000), "(V)");
    }

    @Test
    void test_Number5001IsTranslatedCorrectly () {
        assertEquals(romanParser.arabicToRoman(5001), "(V)I");
    }

    @Test
    void test_Number6000IsTranslatedCorrectly () {
        assertEquals("(MMMCMXCIX)CMXCIX", romanParser.arabicToRoman(3999999));

    }

    @Test
    void test_Number4000000IsTranslatedCorrectly () {
        assertEquals("((CD))", romanParser.arabicToRoman(400000000));
    }
}
