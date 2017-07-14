package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertAllInExceptionTest {
	@Test
	void thrownNullPointerException() {
		assertAll(
				() -> {throw new NullPointerException();},
				() -> assertEquals(2, 3)
		);
	}
}
