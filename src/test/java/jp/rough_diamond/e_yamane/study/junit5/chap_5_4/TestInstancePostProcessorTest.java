package jp.rough_diamond.e_yamane.study.junit5.chap_5_4;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@ExtendWith(TestInstancePostProcessorImpl.class)
@RunWith(JUnitPlatform.class)
public class TestInstancePostProcessorTest {
	TestInstancePostProcessorTest() {
		System.out.println("new Outer");
	}
	@Test
	void foo() {
		System.out.println("outer foo");
	}
	
	@Nested
	class Inner {
		Inner() {
			System.out.println("new Inner");
		}
		@Test
		void foo() {
			System.out.println("inner foo");
		}
	}
}
