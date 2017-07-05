package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_3;

import java.util.Random;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class CapriciousCondition implements ExecutionCondition {
	Random rand = new Random();

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		if(rand.nextInt() % 3 != 0) {
			return ConditionEvaluationResult.enabled("");
		} else {
			if(context.getTestMethod().isPresent()) {
				System.out.println(
						context.getTestMethod().get().getName() + "のテストを中止します");
			} else {
				System.out.println(
						context.getTestClass().get().getSimpleName() + "クラスのテストを中止します");
			}
			return ConditionEvaluationResult.disabled("");
		}
	}
}
