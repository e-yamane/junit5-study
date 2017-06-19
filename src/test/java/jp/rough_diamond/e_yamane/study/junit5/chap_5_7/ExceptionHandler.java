package jp.rough_diamond.e_yamane.study.junit5.chap_5_7;

import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class ExceptionHandler implements TestExecutionExceptionHandler {
	@Override
	public void handleTestExecutionException(TestExtensionContext context, Throwable throwable) throws Throwable {
		System.out.println(throwable.getClass().getSimpleName() + "の例外が発生しました");
	}
}
