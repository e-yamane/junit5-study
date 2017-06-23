package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.11")
@RunWith(JUnitPlatform.class)
class RepeatedTestsDemoTest {

	@RepeatedTest(2)
	void 何にもついてないパターン() {
	}

	@RepeatedTest(2)
	@DisplayName("name無しDisplayName無しパターン")
	void foo() {
	}
	
	@RepeatedTest(value=2, name="{displayName}の繰り返し実行...[{currentRepetition}/{totalRepetitions}]")
	void bar() {}
	
	@RepeatedTest(value=2, name="{displayName}の繰り返し実行...[{currentRepetition}/{totalRepetitions}]")
	@DisplayName("ホゲホゲ")
	void boo() {}
	
//    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
//    @DisplayName("Repeat!")
//    void customDisplayName() {
//    }
//
//    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
//    @DisplayName("Details...")
//    void customDisplayNameWithLongPattern() {
//    }
//
//    @RepeatedTest(value = 5, name = "Wiederholung {currentRepetition} von {totalRepetitions}")
//    void repeatedTestInGerman() {
//        // ...
//    }
//
}