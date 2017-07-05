package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_2_2;

import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

//-Djunit.extensions.autodetection.enabled=true
@RunWith(JUnitPlatform.class)
public class AutomaticExtensionRegistrationTest {
	@Test
	void foo() {
		ServiceLoader<Extension> sl = ServiceLoader.load(Extension.class);
		for(Extension e : sl) {
			System.out.println(e.getClass().getSimpleName());
		}
	}
	
	public static class AutomaticExtension implements BeforeTestExecutionCallback {
		@Override
		public void beforeTestExecution(ExtensionContext context) throws Exception {
			System.out.println("AutomaticExtension!!");
		}
	}
}
