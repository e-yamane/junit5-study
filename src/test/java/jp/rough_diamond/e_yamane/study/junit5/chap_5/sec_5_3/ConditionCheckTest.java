package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_3;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

//-Djunit.conditions.deactivate=*.CapriciousCondition
@RunWith(JUnitPlatform.class)
@ExtendWith(CapriciousCondition.class)
public class ConditionCheckTest {
	@RepeatedTest(100)
	void foo() {}
}
