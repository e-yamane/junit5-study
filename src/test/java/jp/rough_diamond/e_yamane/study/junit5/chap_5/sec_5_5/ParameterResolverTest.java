package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_5;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ParameterResolverTest {
	@Test
	@ExtendWith(StringResolver.class)
	void foo(String str) {
		System.out.println(str);
	}

	@ParameterizedTest
	@ValueSource(strings= {"1", "2", "3"})
	@ExtendWith(StringResolver.class)
	void parameterizedTest(int i, String str) {
		System.out.println(i + "_" + str);
	}
	
	@RepeatedTest(1)
	@ExtendWith(StringResolver.class)
	void repeatedTest(String str) {
		System.out.println(str);
	}
}
