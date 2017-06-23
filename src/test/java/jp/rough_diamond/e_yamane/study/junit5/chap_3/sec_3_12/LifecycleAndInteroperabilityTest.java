package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class LifecycleAndInteroperabilityTest {
	@ParameterizedTest
	@ValueSource(strings = "foo")
	void testWithRegularParameterResolver(String argument, TestReporter testReporter) {
	    testReporter.publishEntry("argument", argument);
	}
}
