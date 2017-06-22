package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertLinesMatchTest {
	@Test
	void linesMatch() {
		assertLinesMatch(Arrays.asList("[^@]+@[^@]+"), Arrays.asList("eijiyamane@gmail.com"));
	}
}
