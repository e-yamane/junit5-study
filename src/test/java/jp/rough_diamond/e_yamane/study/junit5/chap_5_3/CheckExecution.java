package jp.rough_diamond.e_yamane.study.junit5.chap_5_3;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ContainerExecutionCondition;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class CheckExecution implements ContainerExecutionCondition, TestExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluate(TestExtensionContext context) {
		System.out.println("check Test");
		return ConditionEvaluationResult.enabled("");
	}

	@Override
	public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
		System.out.println("check Container");
		return ConditionEvaluationResult.enabled("");
	}

}
