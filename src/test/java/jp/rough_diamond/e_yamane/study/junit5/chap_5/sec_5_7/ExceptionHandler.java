package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_7;

import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class ExceptionHandler implements TestExecutionExceptionHandler {
	@Override
	public void handleTestExecutionException(TestExtensionContext context, Throwable ex) throws Throwable {
		System.out.printf("%s実行中に%sが発生しました。\n", 
				context.getTestMethod().get().getName(), ex.getClass().getSimpleName());
		throw ex;
	}
}
