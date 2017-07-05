package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_8;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;

public class StoreExtension implements BeforeAllCallback, BeforeEachCallback, BeforeTestExecutionCallback,
		AfterTestExecutionCallback, AfterEachCallback, AfterAllCallback {
	@Override
	public void beforeAll(ExtensionContext context) throws Exception {
		System.out.println("beforeAll");
		debugStore(context);
	}
	
	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		System.out.println("beforeEach");
		debugStore(context);
	}

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		System.out.println("beforeTestExecution");
		debugStore(context);
	}
	
	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		System.out.println("afterTestExecution");
		debugStore(context);
	}
	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		System.out.println("afterEach");
		debugStore(context);
	}
	@Override
	public void afterAll(ExtensionContext context) throws Exception {
		System.out.println("afterAll");
		debugStore(context);
	}

	private void debugStore(ExtensionContext context) {
		Store store = context.getStore(Namespace.create("hoge"));
		System.out.println(store);
		if(store.get("foo") == null) {
			System.out.println("fooに値がありません");
			store.put("foo", "xyz");
		} else {
			System.out.println(store.get("foo"));
		}
	}
}
