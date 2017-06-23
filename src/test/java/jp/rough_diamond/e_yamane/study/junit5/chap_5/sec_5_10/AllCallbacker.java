package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_10;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ContainerExecutionCondition;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class AllCallbacker implements BeforeAllCallback, BeforeEachCallback, 
		BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback, 
		AfterAllCallback, TestInstancePostProcessor, TestExecutionExceptionHandler,
		ContainerExecutionCondition, TestExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluate(TestExtensionContext context) {
		System.out.println("TestExecutionCondition");
		return ConditionEvaluationResult.enabled("");
	}

	@Override
	public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
		System.out.println("ContainerExecutionCondition");
		return ConditionEvaluationResult.enabled("");
	}

	@Override
	public void handleTestExecutionException(TestExtensionContext context, Throwable throwable) throws Throwable {
		System.out.println("handleTestExecutionException");
		//throw throwable;
	}

	@Override
	public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
		System.out.println("postProcessTestInstance");
	}

	@Override
	public void afterAll(ContainerExtensionContext context) throws Exception {
		System.out.println("afterAll");
	}

	@Override
	public void afterEach(TestExtensionContext context) throws Exception {
		System.out.println("afterEach");
	}

	@Override
	public void afterTestExecution(TestExtensionContext context) throws Exception {
		System.out.println("afterTestExecution");
	}

	@Override
	public void beforeTestExecution(TestExtensionContext context) throws Exception {
		System.out.println("beforeTestExecution");
	}

	@Override
	public void beforeEach(TestExtensionContext context) throws Exception {
		System.out.println("beforeEach");
	}

	@Override
	public void beforeAll(ContainerExtensionContext context) throws Exception {
		System.out.println("beforeAll");
	}
}
