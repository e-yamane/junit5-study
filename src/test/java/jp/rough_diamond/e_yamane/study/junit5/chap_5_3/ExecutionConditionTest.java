package jp.rough_diamond.e_yamane.study.junit5.chap_5_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

// -Djunit.conditions.deactivate=*
@ExtendWith(CheckExecution.class)
@RunWith(JUnitPlatform.class)
public class ExecutionConditionTest {
	@Test
	void testIt1(){}
	@Test
	void testIt2(){}
}
