package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.11")
@RunWith(JUnitPlatform.class)
public class SimpleRepeartedTest {
	@Nested
	class NestedTest {
		@BeforeEach
		void before(RepetitionInfo info) {
			System.out.println(info);
		}
		
		@RepeatedTest(3)
		void testIt() {
			System.out.println("test It!!");
		}
	}
	
	@Test
	void nonRepeatredTest(){}
}
