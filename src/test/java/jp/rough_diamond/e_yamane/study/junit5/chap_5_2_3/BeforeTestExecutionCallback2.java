package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_3;

import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class BeforeTestExecutionCallback2 implements BeforeTestExecutionCallback {
	public BeforeTestExecutionCallback2() {
		System.out.println("create BeforeTestExecutionCallback2");
	}
	
	@Override
	public void beforeTestExecution(TestExtensionContext context) throws Exception {
		System.out.println("BeforeTestExecutionCallback2");
	}
}
