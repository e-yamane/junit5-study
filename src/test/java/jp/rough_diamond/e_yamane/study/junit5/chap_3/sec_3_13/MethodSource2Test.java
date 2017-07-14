package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.util.stream.IntStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class MethodSource2Test {
	@ParameterizedTest
	@MethodSource("intParams")
	void testIt(int i) {
		System.out.println(i);
	}
	
	static IntStream intParams() {
		return IntStream.of(1, 2, 3);
	}
}
