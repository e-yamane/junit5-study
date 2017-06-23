package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_3;

import java.util.Random;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ContainerExecutionCondition;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class CapriciousCondition implements ContainerExecutionCondition, TestExecutionCondition {
	Random rand = new Random();
	@Override
	public ConditionEvaluationResult evaluate(TestExtensionContext context) {
		if(rand.nextInt() % 3 != 0) {
			return ConditionEvaluationResult.enabled("");
		} else {
			System.out.println(
					context.getTestMethod().get().getName() + "のテストを中止します");
			return ConditionEvaluationResult.disabled("");
		}
	}

	@Override
	public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
		if(rand.nextInt() % 3 != 0) {
			return ConditionEvaluationResult.enabled("");
		} else {
			System.out.println(
					context.getTestClass().get().getSimpleName() + "クラスのテストを中止します");
			return ConditionEvaluationResult.disabled("");
		}
	}
}
