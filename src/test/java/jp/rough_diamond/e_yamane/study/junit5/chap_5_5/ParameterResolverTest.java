package jp.rough_diamond.e_yamane.study.junit5.chap_5_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(ParameterResolverImpl.class)
public class ParameterResolverTest {
	@ParameterizedTest
	@ValueSource(ints=0)
	void foo(int val, String text) {
		System.out.println(val);
		System.out.println(text);
	}

//	@ParameterizedTest
//	@ValueSource(strings="xyz")
//	void bar(String val, String text) {
//		System.out.println(val);
//		System.out.println(text);
//	}
	
	@Test
	void boo(String text1, String text2) {
		System.out.println(text1);
		System.out.println(text2);
	}
}
