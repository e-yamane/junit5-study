package jp.rough_diamond.e_yamane.study.junit5.chap_5_4;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class TestInstancePostProcessorImpl implements TestInstancePostProcessor/*, BeforeAllCallback*/ {

	@Override
	public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
		System.out.println(testInstance.getClass().getName());
	}

	//@Override
	public void beforeAll(ContainerExtensionContext context) throws Exception {
		System.out.println("call Before All:" + context.getTestClass().get());
	}
}
