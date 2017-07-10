package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.util.stream.Stream;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class ArgumentsSourceParameterizedTest {
	@ParameterizedTest
	@ArgumentsSource(MyArgumentsProvider.class)
	void testWithArgumentsSource(String argument) {
		System.out.printf("testWithArgumentsSource:[%s]\n", argument);
	}
	
	static class MyArgumentsProvider implements ArgumentsProvider {
	    @Override
	    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
	        return Stream.of("foo", "bar").map(Arguments::of);
	    }
	}
}
