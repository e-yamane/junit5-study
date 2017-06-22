package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_1_1;

import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SlowTestTest {
	@SlowTest
	void testIt(TestInfo testInfo) {
		System.out.println(testInfo.getTags());
	}
}
