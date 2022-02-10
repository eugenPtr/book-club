package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanNumeralsApplicationTests {

    private final RomanGenerator romanGenerator = new RomanGenerator();

    @Test
	void contextLoads() {
	}

	@Test
	void test_NumberOneIsTranslatedCorrectly () {
		assertEquals(romanGenerator.from(1), "I");
	}

	@Test
	void test_NumberTwoIsTranslatedCorrectly () {
		assertEquals(romanGenerator.from(2), "II");
	}

	@Test
	void test_NumberThreeIsTranslatedCorrectly () {
		assertEquals(romanGenerator.from(3), "III");
	}

	@Test
	void test_NumberFourIsTranslatedCorrectly () {
		assertEquals(romanGenerator.from(4), "IV");
	}

    @Test
    void test_NumberFiveIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(5), "V");
    }

    @Test
    void test_NumberSixIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(6), "VI");
    }

    @Test
    void test_NumberSevenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(7), "VII");
    }

    @Test
    void test_NumberEightIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(8), "VIII");
    }

    @Test
    void test_NumberNineIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(9), "IX");
    }

    @Test
    void test_NumberTenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(10), "X");
    }

    @Test
    void test_NumberElevenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(11), "XI");
    }

    @Test
    void test_NumberTwelveIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(12), "XII");
    }

    @Test
    void test_NumberThirteenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(13), "XIII");
    }

    @Test
    void test_NumberFourteenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(14), "XIV");
    }

    @Test
    void test_NumberNineteenIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(19), "XIX");
    }

    @Test
    void test_NumberFortyNineIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(49), "XLIX");
    }

    @Test
    void test_NumberFiftyIsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(50), "L");
    }

    @Test
    void test_Number3589IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(3589), "MMMDLXXXIX");
    }

    @Test
    void test_Number3999IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(3999), "MMMCMXCIX");
    }

    @Test
    void test_Number4000IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(4000), "(IV)");
    }

    @Test
    void test_Number4001IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(4001), "(IV)I");
    }

    @Test
    void test_Number5000IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(5000), "(V)");
    }

    @Test
    void test_Number5001IsTranslatedCorrectly () {
        assertEquals(romanGenerator.from(5001), "(V)I");
    }

    @Test
    void test_Number6000IsTranslatedCorrectly () {
        assertEquals("(MMMCMXCIX)CMXCIX", romanGenerator.from(3999999));

    }

    @Test
    void test_Number4000000IsTranslatedCorrectly () {
        assertEquals("((CD))", romanGenerator.from(400000000));
    }
}
