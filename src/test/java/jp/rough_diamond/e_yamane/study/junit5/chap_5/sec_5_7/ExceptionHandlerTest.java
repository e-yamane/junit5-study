package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(ExceptionHandler.class)
public class ExceptionHandlerTest {
	@Test
	void foo() {
		throw new RuntimeException();
	}
	
	@Test
	void bar() {
		assertEquals(2, 1 + 1);
	}
}
