package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_7;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class ExceptionHandler implements TestExecutionExceptionHandler {
	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable ex) throws Throwable {
		System.out.printf("%s実行中に%sが発生しました。\n", 
				context.getTestMethod().get().getName(), ex.getClass().getSimpleName());
		throw ex;
	}
}
