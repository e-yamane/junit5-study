package jp.rough_diamond.e_yamane.study.junit5.chap_3_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("3.11")
public class SimpleRepeartedTest {
	@BeforeEach
	void before(RepetitionInfo info) {
		System.out.println(info);
	}
	
	@RepeatedTest(3)
	void testIt() {
		System.out.println("test It!!");
	}
	
	@Test
	void nonRepeatredTest(){}
}
