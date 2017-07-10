package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_11;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class AllCallbacker implements BeforeAllCallback, BeforeEachCallback, 
		BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback, 
		AfterAllCallback, TestInstancePostProcessor, TestExecutionExceptionHandler,
		ExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		System.out.println("ExecutionCondition:" + context.getTestMethod().isPresent());
		return ConditionEvaluationResult.enabled("");
	}

	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
		System.out.println("handleTestExecutionException");
		//throw throwable;
	}

	@Override
	public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
		System.out.println("postProcessTestInstance");
	}

	@Override
	public void afterAll(ExtensionContext context) throws Exception {
		System.out.println("afterAll");
	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		System.out.println("afterEach");
	}

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		System.out.println("afterTestExecution");
	}

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		System.out.println("beforeTestExecution");
	}

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		System.out.println("beforeEach");
	}

	@Override
	public void beforeAll(ExtensionContext context) throws Exception {
		System.out.println("beforeAll");
	}
}
