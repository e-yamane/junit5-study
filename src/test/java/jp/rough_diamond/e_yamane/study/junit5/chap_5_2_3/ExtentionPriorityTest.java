package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(ParameterFooResolver1.class)
@ExtendWith(BeforeTestExecutionCallback1.class)
public class ExtentionPriorityTest {
	@Test
	@ExtendWith(ParameterFooResolver1.class)
	@ExtendWith(BeforeTestExecutionCallback1.class)
	void foo(Foo foo) {
		System.out.println(foo.text);
	}
	
	@Test
	@ExtendWith(ParameterFooResolver1.class)
	@ExtendWith(BeforeTestExecutionCallback1.class)
	void foo2(Foo foo) {
		System.out.println(foo.text);
	}
}
