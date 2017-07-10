package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class MethodSourceParameterizedTest {
	@ParameterizedTest
	@MethodSource({"stringProvider", "stringIterableProvider", "stringIteratorProvider", "stringArrayProvider"})
	void testWithSimpleMethodSource(String str) {
		System.out.println("testWithSimpleMethodSource:" + str);
	}
	
	static Stream<String> stringProvider() {
	    return Stream.of("foo", "bar");
	}
	
	static Iterable<String> stringIterableProvider() {
		return Arrays.asList("hoge", "poge");
	}

	static Iterator<String> stringIteratorProvider() {
		return Arrays.asList("a", "b").iterator();
	}
	static String[] stringArrayProvider() {
		return new String[]{"c", "d"};
	}
	
	@ParameterizedTest
	@MethodSource("stringAndIntProvider")
	void testWithMultiArgMethodSource(String first, int second) {
		System.out.printf("testWithMultiArgMethodSource_first:[%s], second:[%d]\n", first, second);
	}

	static Stream<Arguments> stringAndIntProvider() {
	    return Stream.of(
    			Arguments.of("foo", 1), 
    			Arguments.of("bar", 2));
	}
}
