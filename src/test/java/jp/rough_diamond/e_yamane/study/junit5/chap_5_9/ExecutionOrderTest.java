package jp.rough_diamond.e_yamane.study.junit5.chap_5_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(ExecutionOrderExtension.class)
public class ExecutionOrderTest {
	ExecutionOrderTest() {
		System.out.println("new Test Class");
	}
	
	@Test
	void foo() {
		System.out.println("Test IT!!");
		throw new RuntimeException();
	}
}
