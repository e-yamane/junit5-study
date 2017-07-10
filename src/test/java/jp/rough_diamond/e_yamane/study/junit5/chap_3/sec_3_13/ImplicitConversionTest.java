package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class ImplicitConversionTest {
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion(TimeUnit argument) {
		System.out.println("testWithImplicitArgumentConversion_" + argument);
	}
}
