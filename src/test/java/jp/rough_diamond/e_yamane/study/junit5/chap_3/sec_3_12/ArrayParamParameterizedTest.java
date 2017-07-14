package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_12;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ArrayParamParameterizedTest {
	@ParameterizedTest(name="testIt:{arguments}")
	@MethodSource("params")
	void testIt(@ConvertWith(StringArrayConverter.class) String[] params) {
		System.out.println(params);
		Stream.of(params).forEach(System.out::println);
	}
	
	static Stream<String[]> params() {
		return Stream.of(new String[]{"a","b"}, new String[]{"b", "c"});
	}
	
	static class StringArrayConverter extends SimpleArgumentConverter {
		@Override
		protected Object convert(Object source, Class<?> targetType) {
			System.out.println(source.getClass());
			return new String[]{"1", "2"};
		}
	}
}
