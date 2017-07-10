package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class SimplePerameterizedTest {
	@ParameterizedTest
	@ValueSource(strings={"aaa", "bbb"})
	void testOneParam(String arg) {
		System.out.println(arg);
	}

	@ParameterizedTest
	@EnumSource(value=TimeUnit.class,names={"HOURS"})
	void testEnum(TimeUnit unit) {
		System.out.println(unit);
	}
}
