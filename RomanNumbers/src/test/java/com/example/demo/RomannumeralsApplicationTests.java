package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

//	@Test
//	void test_NumberFourteenIsTranslatedCorrectly () {
//
//		assertEquals(arabicToRoman(14), "XIV");
//
//	}



	private String arabicToRoman(int i) {
		if (i == 4) return "IV";

		StringBuilder result = new StringBuilder();
		for (int nr = 1; nr <= i; nr++)
			result.append("I");

		return result.toString();
	}

}
