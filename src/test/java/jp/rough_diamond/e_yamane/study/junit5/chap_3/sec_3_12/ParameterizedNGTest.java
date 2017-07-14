package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class ParameterizedNGTest {
	@BeforeEach
	void setUp1(TestInfo info) {
	}

	@BeforeEach
	void setUp2(String p1, String p2) {
		System.out.println(p1 + p2);
	}
	
	@ParameterizedTest
	@CsvSource({ "x, 1", "y, 2","z, 3" })
	void testIt(String input, String expected) {
	}
}
