package jp.rough_diamond.e_yamane.study.junit5.chap_5_8;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class LifeCycleCheckExtention1 implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
	@Override
	public void beforeTestExecution(TestExtensionContext context) throws Exception {
		System.out.println("before 1");
		System.out.println("\t" + context);
		Store store = context.getStore(Namespace.create("hoge"));
		System.out.println("\t" + store);
		System.out.println("\t" + store.get("abc"));
		store.put("abc", "def");
	}

	@Override
	public void afterTestExecution(TestExtensionContext context) throws Exception {
		System.out.println("after 1");
		System.out.println("\t" + context);
		Store store = context.getStore(Namespace.create("hoge"));
		System.out.println("\t" + store);
		System.out.println("\t" + store.get("abc"));
	}
}
