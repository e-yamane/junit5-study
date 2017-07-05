package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_2_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExtendWithTest {
	@Test
	@ExtendWith({FooExtension.class, BarExtension.class})
	void test1() {
		System.out.println("test1");
	}
	@Test
	@ExtendWith(FooExtension.class)
	@ExtendWith(BarExtension.class)
	void test2() {
		System.out.println("test2");
	}
	public static class FooExtension implements BeforeTestExecutionCallback {
		@Override
		public void beforeTestExecution(ExtensionContext context) throws Exception {
			System.out.println("Foo");
		}
	}
	public static class BarExtension implements BeforeTestExecutionCallback {
		@Override
		public void beforeTestExecution(ExtensionContext context) throws Exception {
			System.out.println("Bar");
		}
	}
}
