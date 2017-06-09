package jp.rough_diamond.e_yamane.study.junit5.chap_4_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.UseTechnicalNames;
import org.junit.runner.RunWith;

@UseTechnicalNames
@RunWith(JUnitPlatform.class)
public class JUnit5RunningJUnit4Test {
	@DisplayName("ホゲホゲ")
	@ParameterizedTest(name="{index}:{arguments}")
	@ValueSource(strings={"abc", "def"})
	void lagacyRunnerTest(String param) {
		System.out.println(param);
	}
}
